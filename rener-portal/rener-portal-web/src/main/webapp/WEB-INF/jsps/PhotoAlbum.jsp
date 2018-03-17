<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--<c:set var="picPath" value="http://127.0.0.1:8004/ssmImage"></c:set>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>相冊展示</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#test").click(function () {
                alert("点了一下");
                $.ajax({
                    url: '${pageContext.request.contextPath }/photo/allMonth',
                    type: "POST",
                    dataType: "JSON",
                    data: {
                        id: 1
                    },
                    success: function (data) {
                        alert(data);
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
<input type="button" id="test">
</body>

</html>