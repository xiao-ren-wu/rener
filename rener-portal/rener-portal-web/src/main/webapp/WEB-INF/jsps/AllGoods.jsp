<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/1/28
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<c:forEach items="${goodsPicName}" var="goodsPicName">
    <a href="#">${goodsPicName.goodsSamplePic}</a>
</c:forEach>
</center>
<table width="100%" border="1px">
    <c:forEach items="${someType}" var="someTypes">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">${someTypes.goodsType}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </c:forEach>
    <tr>
    <c:forEach items="${types}" var="types">
    <td width="200px">
        ${types.goodsType}
    </td>
    </c:forEach>
    <c:forEach items="${address}" var="address">
        <td width="200px">
            ${address.storeAddress}
        </td>
    </c:forEach>
    <c:forEach items="${auto}" var="auto">
        <td width="200px">
            ${auto}
        </td>
    </c:forEach>
    </tr>
</table>


<table width="100%" border="1px">
    <tr>
        <td>商品ID</td>
        <td>商品名称</td>
        <td>商品图片</td>
        <td>好评率</td>
        <td>价格</td>
        <td>销量</td>
        <td>折扣率</td>
        <td>商铺名称</td>
        <td>商铺地址</td>
    </tr>
    <c:forEach items="${allGoods}" var="allGoods">
        <tr>
            <td>${allGoods.goodsId}</td>
            <td>${allGoods.goodsName}</td>
            <td>${allGoods.goodsPic}</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
