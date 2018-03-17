<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>支付</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
</head>
<body>
<div id="m-pay">
    <div id="div1">
        确认付款
        <input type="button" value="X" id="btn1"/>
        <input type="button" value="?" id="btn2"/>
    </div>
    <div id="div2">
        <p1>￥${price}</p1>
        <h2>支付宝账号<p2>414***@qq.com</p2></h2>
    </div>
    <div id="div3">
        <h3>付款方式<p3>工商银行储蓄卡(54s8)</p3></h3>
    </div>
    <div id="div4">
        <h4>花呗最高立减10元<input type="button"  value="立即使用" id="btn3"></h4>
    </div>
    <div id="div5">
        <input type="button" value="立即付款" id="btn4"/>
    </div>
</div>
<script src="../../js/module/pay.js"></script>
</body>
</html>