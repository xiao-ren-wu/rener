package com.rener.portal.service.impl;


import com.rener.portal.dao.*;
import com.rener.portal.model.mo.TbAddress;
import com.rener.portal.model.mo.TbGoodsCar;
import com.rener.portal.model.mo.TbOrderDetailses;
import com.rener.portal.model.mo.TbOrders;
import com.rener.portal.model.po.OrderState;
import com.rener.portal.model.utils.ResultVo;
import com.rener.portal.model.utils.ReturnUUID;
import com.rener.portal.model.vo.OrderPage;
import com.rener.portal.model.vo.OrderPageDetail;
import com.rener.portal.model.vo.PayOrderPage;
import com.rener.portal.model.vo.SimpleOrderPage;
import com.rener.portal.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private TbGoodsMapper tbGoodsMapper;
    @Resource
    private TbOrdersMapper tbOrdersMapper;
    @Resource
    private TbGoodsCarMapper tbGoodsCarMapper;
    @Resource
    private SimpleOrderPageMapper simpleOrderPageMapper;
    @Resource
    private OrderPageMapper orderPageMapper;
    @Resource
    private TbAddressMapper tbAddressMapper;
    @Resource
    private TbOrderDetailsesMapper tbOrderDetailsesMapper;
    @Resource
    private TbDiscountMapper tbDiscountMapper;

    @Override
    public ResultVo<SimpleOrderPage> getPageOrderOfStatus(int status, int count, Long userId) {
        ResultVo<SimpleOrderPage> resultVo = new ResultVo<>();
        if (resultVo.getCount() + resultVo.getPageNum() < resultVo.getAllNum()) {
            resultVo.setSuccess(0);
        }
        resultVo.setAllNum(tbOrdersMapper.selectOrderNum(userId));
        resultVo.setCount(count);
        resultVo.setItems(simpleOrderPageMapper.selectOrderByStatus(new Long(status), resultVo.getCount(), resultVo.getPageNum(), new OrderState()));
        for (SimpleOrderPage simpleOrderPage : resultVo.getItems()) {
            Integer state = simpleOrderPage.getOrderState();
            switch (state.intValue()) {
                case 2:
                    simpleOrderPage.setStateMessage("进行中");
                    break;
                case 5:
                    simpleOrderPage.setStateMessage("已付款");
                    break;
                case 3:
                    simpleOrderPage.setStateMessage("待点评");
                    break;
                case 4:
                    simpleOrderPage.setStateMessage("已取消");
                    break;
            }
        }
        return resultVo;
    }

    @Override
    public PayOrderPage getPageOrderInformation(List<Long> orderId, Long userId, Long addressId) {
        DecimalFormat df = new DecimalFormat("#.00");
        PayOrderPage payOrderPage = new PayOrderPage();
        List<TbAddress> tbAddresses = tbAddressMapper.selectUserAddress1(userId, 1, 0);
        if (addressId == null) {
            TbAddress tbAddress;
            if (tbAddresses == null || tbAddresses.size() == 0) {
                tbAddress = new TbAddress();
                tbAddress.setAddressId((long) -1);
                tbAddress.setConsignee("");
                tbAddress.setConsigneeAddress("");
            } else {
                tbAddress = tbAddresses.get(0);
            }
            payOrderPage.setAddress(tbAddress);
        } else {
            payOrderPage.setAddress(tbAddressMapper.selectUserAddressById(addressId));
        }
        System.out.println(payOrderPage.getAddress().toString());
        List<OrderPage> orderPages = orderPageMapper.selectOrdersByIds(orderId);
        for (OrderPage orderPage : orderPages) {
            BigDecimal totalPrice = new BigDecimal(0);
            for (OrderPageDetail orderPageDetail : orderPage.getOrderPageDetails()) {
                BigDecimal decimal = new BigDecimal(orderPageDetail.getGoodsTotalprice()).multiply(new BigDecimal(tbDiscountMapper.findDiscountRate(tbGoodsMapper.selectDiscountById(orderPageDetail.getTbGoods().getGoodsId()))));

                orderPageDetail.setNowPrice(df.format(decimal));

                totalPrice = totalPrice.add(decimal.multiply(new BigDecimal(orderPageDetail.getGoodsNumber())));
            }
            orderPage.setOrderNowprice(df.format(totalPrice));
        }
        payOrderPage.setOrderPages(orderPages);

        return payOrderPage;
    }

    @Transactional
    @Override
    public void setOrderStatus(List<Long> orderIds, Long status) {
        for (Long orderId : orderIds) {
            tbOrdersMapper.updateStatus(orderId, status);
            if ((status == 1) || (status == 3) || (status == 4)) {
                tbOrdersMapper.updateTimeByStaus(orderId, new Date(System.currentTimeMillis()), status);
            }
        }
    }

    @Transactional
    @Override
    public List<Long> saveorders(List<Long> goodsId, Long userId) {
        List<Long> storesId = tbGoodsMapper.selectTypeCount(goodsId);
        for (Long i : storesId) {
            System.out.println("店鋪ID：" + i);
        }
        List<TbOrders> tbOrders = new ArrayList<>();
        List<Long> orderId = new ArrayList<>();
        TbOrders tbOrder;
        for (Long storeId : storesId) {
            tbOrder = new TbOrders();
            tbOrder.setOrderNum(ReturnUUID.getUUID(1));
            tbOrder.setStoreId(storeId);
            //在购物车表里面查找有哪些
            List<TbGoodsCar> tbGoodsCars = tbGoodsCarMapper.selectByStoreId(tbOrder.getStoreId(), goodsId, userId);
            List<Long> goodsCarId = new ArrayList<>();
            for (TbGoodsCar tbGoods : tbGoodsCars) {
                goodsCarId.add(tbGoods.getGoodsCarId());
            }
            tbOrder.setUserId(userId);
            tbOrder.setOrderState(1);
            tbOrder.setOrderCreatedate(new Date(System.currentTimeMillis()));
            tbOrdersMapper.insertOrderId(tbOrder);
            orderId.add(tbOrder.getOrderId());
            BigDecimal totalPrice = new BigDecimal(0);
            for (TbGoodsCar goodsCar : tbGoodsCars) {
                BigDecimal price = tbGoodsMapper.selectGoodsPrice(goodsCar.getGoodsId());
                price.multiply(new BigDecimal(goodsCar.getCount().intValue()));
                TbOrderDetailses tbOrderDetailses = new TbOrderDetailses();
                tbOrderDetailses.setGoodsId(goodsCar.getGoodsId());
                tbOrderDetailses.setGoodsTotalprice(price);
                tbOrderDetailses.setOrderId(tbOrder.getOrderId());
                tbOrderDetailses.setGoodsNumber(goodsCar.getCount());
                System.out.println(tbOrderDetailsesMapper);
                tbOrderDetailsesMapper.insert(tbOrderDetailses.getOrderId(),
                        tbOrderDetailses.getGoodsId(), tbOrderDetailses.getGoodsNumber(),
                        tbOrderDetailses.getGoodsTotalprice());
                //这里要考虑折扣商品（但一起没有人实线折扣）
                totalPrice = totalPrice.add(price);
                List<Long> list = new ArrayList<>();
                System.out.println("訂單ID：" + goodsCar.getGoodsCarId());
                list.add(goodsCar.getGoodsCarId());
                tbGoodsCarMapper.delete(list);
                tbGoodsMapper.updateGoodsNum(goodsCar.getGoodsId(), goodsCar.getCount());
            }
            //更新打折后总价钱
            tbOrdersMapper.updateTotalPrice(tbOrder.getOrderId(), totalPrice);
        }
        return orderId;
    }

    @Transactional
    @Override
    public void saveOrderDescribe(String message, List<Long> orderIds) {
        if (message == null) {
            message = "";
        }
        Date date = new Date(System.currentTimeMillis());
        for (Long orderId : orderIds) {
            tbOrdersMapper.updateOrderDescribe(message, orderId, date);
        }
    }

    @Override
    public ResultVo<SimpleOrderPage> getAllOrderByStatus(int status, Long userId) {
        List<SimpleOrderPage> simpleOrderPages = simpleOrderPageMapper.selectAllOrderByStatus(new Long(status), userId);
        for (SimpleOrderPage simpleOrderPage : simpleOrderPages) {
            Integer state = simpleOrderPage.getOrderState();
            switch (state.intValue()) {
                case 2:
                    simpleOrderPage.setStateMessage("进行中");
                    break;
                case 5:
                    simpleOrderPage.setStateMessage("已付款");
                    break;
                case 3:
                    simpleOrderPage.setStateMessage("待点评");
                    break;
                case 4:
                    simpleOrderPage.setStateMessage("已取消");
                    break;
            }
        }
        ResultVo<SimpleOrderPage> resultVo = new ResultVo<>();
        resultVo.setItems(simpleOrderPages);
        return resultVo;
    }
}
