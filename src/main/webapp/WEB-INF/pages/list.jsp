<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>成功跳转到了list页面</h3>
    <%--遍历集合--%>
    <c:forEach items="${accounts}" var="account">
        ${account.username}<br>
    </c:forEach>
</body>
</html>
