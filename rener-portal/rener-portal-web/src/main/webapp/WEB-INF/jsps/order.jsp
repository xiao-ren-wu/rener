<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>订单</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script src="../../js/lib/jquery.min.js"></script>
</head>
<body>
<div id="m-order">
    <div id="header">
        <div class="header clearfix">
            <img src="../../img/order/logo.png">
            <div class="landing">
                <c:if test="${empty user}">
                    <a href="${pageContext.request.contextPath}/user?method=loginUI">登陆</a><span>|</span><a
                        href="${pageContext.request.contextPath}/user?method=registerUI">注册</a>
                </c:if>
                <c:if test="${not empty user}">
                    <a>${user.uName}，你好！</a><span>|</span><a
                        href="/order?method=findMyOrderByPage&pageNumber=1">我的订单</a>
                    <span>|</span><a href="${pageContext.request.contextPath}/user?method=loginout">退出</a>
                    <span>|</span>
                </c:if><a href="../../shoppingCart.jsp">购物车</a><span>|</span><a
                    href="#">收藏夹</a>
            </div>
            <input class="btn1" type="text"/>
            <input class="btn2" type="button" value="搜索"/>
            <div class="announcement clearfix">

            </div>
        </div>
        <ul class="nav clearfix">
            <li><a href="../../goodsList.jsp">全部商品分类</a></li>
            <li><a href="../../index.jsp">首页</a></li>
            <li><a href="../../goodsList.jsp">潮流搭配</a></li>
            <li><a href="../../goodsList.jsp">新品上市</a></li>
            <li><a href="../../goodsList.jsp">热卖推荐</a></li>
        </ul>
    </div>
    <div id="border-1"><img src="../../img/order/border.png"></div>
    <div id="content">
        <div id="address">
            <h5>默认收货地址：
                <div id="moren">${order.user.uAddr}</div>
            </h5>
            <div id="address-1">
                <!--第一个地址-->
                <div id="address-1-1">
                    <div id="address-1-2">
                        <!--选择-->
                        <div id="address-check-1"></div>
                    </div>
                    <div id="address-1-3">陕西省西安市长安区西安邮电大学</div>
                </div>
                <!--第二个地址-->
                <div id="address-2-1">
                    <div id="address-2-2">
                        <!--选择-->
                        <div id="address-check-2"></div>
                    </div>
                    <div id="address-2-3">陕西省西安市长安区西北政法大学</div>
                </div>
                <input type="button" id="btn1" value="+添加收货地址"/>
                <!--第三个地址-->
                <div id="address-3-1">
                    <div id="address-3-2">
                        <!--选择-->
                        <div id="address-check-3"></div>
                    </div>
                    <input type="text" id="address-3-3"/>
                    <input type="button" id="btn2" value="确认"/>
                </div>
                <div id="border"><img src="../../img/order/border.png"></div>
            </div>
        </div>
        <div id="submit">
            <c:forEach items="${order.list}" var="good">
                <div id="goods">
                    <div id="pic"><img src="${good.shop.path}" id="goods-pic"></div>
                    <div id="goods-introduce">
                        <p8>${good.shop.goodsName}</p8>
                        <br/>
                        <p9>${good.shop.information}</p9>
                        <span1>${good.subtotal}</span1>
                        <span2>x${good.count}</span2>
                    </div>
                </div>
            </c:forEach>
            <div id="list">
                <div id="list-1">购买数量:
                    <p1>${order.list.size()}</p1>
                </div>
                <div id="list-2">此商品支持7天退货
                    <p2>否</p2>
                </div>
                <div id="list-3">配送方式
                    <p3>包邮</p3>
                </div>
                <div id="list-4">运费险
                    <p4>无</p4>
                </div>
                买家留言：<input type="index" id="list-5"/>
                <div id="list-6">
                    <div id="sum">共计
                        <p7>${order.list.size()}</p7>
                        件商品 小计：
                        <p5>${order.allPrice}</p5>
                    </div>
                </div>
            </div>
            <div id="border-2"><img src="../../img/order/border.png"></div>
            <input type="button" value="提交订单" id="suborder"/>
            <script type="text/javascript">
                var oBtn = document.getElementById("suborder");
                oBtn.onclick = function () {
                    window.location.href = "${pageContext.request.contextPath}/order?method=getPay&id=${order.id}";
                }
            </script>
        </div>
        <div id="bottom">
            <div class="bottom">
                <div class="bottom_1 clearfix">
                    <ul>
                        <li class="li1">服务保证</li>
                        <li>正品保证</li>
                        <li>7天无理由退换</li>
                        <li>退货返运费</li>
                        <li>24小时客户服务</li>
                    </ul>
                    <ul>
                        <li class="li1">服务保证</li>
                        <li>正品保证</li>
                        <li>7天无理由退换</li>
                        <li>退货返运费</li>
                        <li>24小时客户服务</li>
                    </ul>
                    <ul>
                        <li class="li1">服务保证</li>
                        <li>正品保证</li>
                        <li>7天无理由退换</li>
                        <li>退货返运费</li>
                        <li>24小时客户服务</li>
                    </ul>
                </div>
                <ul class="bottom_2">
                    <li>版权声明</li>
                    <li>联系我们</li>
                    <li>网站声明</li>
                    <li>来购联盟</li>
                </ul>
                <p>地址：南京电弧电话给预估收入分入园</p>
                <p>客服电话：1545145145514</p>
                <p>©2017 网站-服装饰品 版权所有</p>
            </div>
        </div>

    </div>
</div>
<script src="js/module/orde r.js"></script>
</body>
</html>