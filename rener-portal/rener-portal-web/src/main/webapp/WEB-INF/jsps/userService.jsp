<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/28
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户中心</title>

    <%--请求json数据--%>

    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#test").click(function () {
                alert("有能耐在点一下！！！");
                $.ajax({
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    url: '${pageContext.request.contextPath}/updateUserMsg/updatePwd',
                    type: "POST",
                    dataType: "JSON",
                    data: {
                        userId : 1,oldPass:"12345",newPass:"54321"
                    },
                    success: function (flag) {
                        alert(flag);
=======
=======
>>>>>>> lidan
=======
>>>>>>> yujiatong
                    url: '${pageContext.request.contextPath}/userHome/findUserById',
                    type: "POST",
                    dataType: "JSON",
                    data: {
                        userId : 1
                    },
                    success: function (userHome) {
                        alert(userHome);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> yangdi
=======
>>>>>>> lidan
=======
>>>>>>> yujiatong
                    },
                    error: function () {
                        alert("传输失败");
                    }
                })
            })
        })
    </script>


</head>
<body>

<input type="button" id="test" value="给我整">


</body>
</html>
