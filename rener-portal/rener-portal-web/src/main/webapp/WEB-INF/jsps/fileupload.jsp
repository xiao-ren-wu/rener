<%--
  Created by IntelliJ IDEA.
  User: 杨迪
  Date: 2018/2/3
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
</head>
<body>
<h2>上传多个文件 实例</h2>

<form action="${pageContext.request.contextPath }/comment/insert" method="post"
      enctype="multipart/form-data">
    <p>${pageContext.request.contextPath }</p>
    <p>
        选择文件:<input type="file" name="files">
    </p>
    <p>
        选择文件:<input type="file" name="files">
    </p>
    <p>
        选择文件:<input type="file" name="files">
    </p>
    <p>用户id:<input type="text" name="userId"></p>
    <p>物品id:<input type="text" name="goodsId"></p>
    <p>商铺id:<input type="text" name="storeId"></p>
    <p>好评等价:<input type="text" name="praiseLevel"></p>

    <p>上传地点:<input type="text" name="loadPlace"></p>
    <p>是否匿名:<input type="text" name="anonymityTag"></p>
    <p>评论信息:<input type="text" name="commentInfo"></p>
    <p>服务好的:<input type="text" name="goodService"></p>

    <p>地点好的:<input type="text" name="greatLocation"></p>
    <p>健康的:<input type="text" name="goodHealth"></p>
    <p>美味:<input type="text" name="delicious"></p>
        <input type="submit" value="提交">
</form>

</body>
</html>
