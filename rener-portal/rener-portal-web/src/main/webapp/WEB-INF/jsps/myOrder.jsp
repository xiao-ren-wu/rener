<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的订单</title>
    <link href="./scss/module/m-myOrder.css" rel="stylesheet" type="text/css"/>
    <!--<link href="css/style.css" type="text/css" rel="stylesheet">-->
</head>

<body>
<div id="myOrder">
    <div class="header clearfix">
        <img src="../../img/myOrder/logo.png">
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
            </c:if>
            <a href="/shoppingCart.jsp">购物车</a><span>|</span><a
                href="#">收藏夹</a>
        </div>
        <form>
            <input class="btn1" type="text"/>
            <input class="btn2" type="submit" value="搜索"/>
        </form>

    </div>
    <ul class="nav clearfix">
        <li><a href="../../goodsList.jsp">全部商品分类</a></li>
        <li><a href="../../index.jsp">首页</a></li>
        <li><a href="../../goodsList.jsp">潮流搭配</a></li>
        <li><a href="../../goodsList.jsp">新品上市</a></li>
        <li><a href="../../goodsList.jsp">热卖推荐</a></li>
    </ul>
    <div class="main clearfix">
        <ul class="linkarea">
            <li><p>全部功能/ All functions</p></li>
            <li><a href="/order?method=findMyOrderByPage&pageNumber=1">宝贝订单</a></li>
            <li><a href="../../perCenter.jsp">个人资料</a></li>
            <li><a href="../../myCollection.jsp">已收藏宝贝</a></li>
            <li><a href="../../shoppingCart.jsp">我的购物车</a></li>
        </ul>
        <div class="container">
            <div class="con_top">
                <div class="top_head clearfix">
                    <img src="../../img/myCollection/head-portrait.jpg" class="Oimg" id="111">
                    <p class="p p1">${user.uName}</p>
                    <p class="p p2">${user.uAddr}</p>
                </div>
                <div class="top_container clearfix">
                    <ul class="nav3 clearfix" style="overflow: hidden;width: 780px;">
                        <li><a>所有订单</a></li>
                        <li><a>待付款</a></li>
                        <li><a>待发货</a></li>
                        <li><a>待收货</a></li>
                        <li><a>待评价</a></li>
                        <li><a>退款</a></li>
                    </ul>
                    <form class="form1">
                        <label class="text1"><input type="text"></label>
                        <label class="btn1"><input type="submit" value="搜索"></label>
                    </form>
                </div>
                <ul class="nav4">
                    <li>宝贝订单</li>
                    <li>单价</li>
                    <li>商品状态</li>
                    <li>实付款</li>
                    <li>交易操作</li>
                </ul>
            </div>
            <!--//修改的单独的部分-->
            <div class="goods-infor">
                <c:forEach items="${bean.data}" var="temp">
                    <p id="gid"><span>${temp.id}</span></p>
                    <%--<p id="time"><span><fmt:formatDate value="${temp.time}"--%>
                                                       <%--pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </span></p>--%>
                    <ul id="detail1">
                        <c:forEach items="${temp.list}" var="item">
                            <li class="img"><a><img src="${item.shop.path}"></a></li>
                            <li class="descript">${item.shop.goodsName}</li>
                            <li class="price">¥${item.subtotal}</li>
                        </c:forEach>
                            <%--<li class="goods-handle">退款／退货</li>--%>
                        <li class="">¥${temp.allPrice}</li>
                        <c:if test="${temp.status==0}">
                            <li class="deal"><a>去付款</a></li>
                        </c:if>
                        <c:if test="${temp.status==1}">
                            <li class="deal">正在发货</li>
                        </c:if>
                        <c:if test="${temp.status==2}">
                            <li class="deal">已发货</li>
                        </c:if>
                    </ul>
                </c:forEach>
            </div>
        </div>
        <div class="page" id="page">
            <ul class="page">
                <c:if test="${bean.pageNumber==1}">
                    <li class="change" style="color: #0e0b0d"><a href="javascript:void(0)">上一页</a></li>
                </c:if>
                <c:if test="${bean.pageNumber!=1}">
                    <li class="change" style="color: burlywood"><a
                            href="${pageContext.request.contextPath}/order?method=findMyOrderByPage&id=${id}&pageNumber=${bean.pageNumber-1}">上一页</a>
                    </li>
                </c:if>
                <c:forEach var="i" begin="1" end="${bean.totalPage}" step="1">
                    <c:if test="${bean.pageNumber==i}">
                        <li class="page_number" style="color:blue;"><a
                                href="${pageContext.request.contextPath}/order?method=findMyOrderByPage&pid=${id}&pageNumber=${i}">${i}</a>
                        </li>
                    </c:if>
                    <c:if test="${bean.pageNumber!=i}">
                        <li class="page_number" style="color: burlywood"><a
                                href="${pageContext.request.contextPath}/order?method=findMyOrderByPage&pid=${id}&pageNumber=${i}">${i}</a>
                        </li>
                    </c:if>
                </c:forEach>
                <c:if test="${bean.pageNumber==bean.totalPage}">
                    <li class=" change" style="color: #0e0b0d">
                        <a href="javascript:void(0)">下一页</a>
                    </li>
                </c:if>
                <c:if test="${bean.pageNumber!=bean.totalPage}">
                    <li class="change" style="color: burlywood"><a
                            href="${pageContext.request.contextPath}/order?method=findMyOrderByPage&pid=${id}&pageNumber=${bean.pageNumber+1}">下一页</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
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
</body>
<script src="../../js/lib/jquery.min.js"></script>
<script src="../../js/lib/template-web.js"></script>
<script src="../../js/lib/velocity.min.js"></script>
<script src="../../js/module/myOrder.js"></script>
</body>
</html>
