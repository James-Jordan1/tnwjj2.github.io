<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>测试SpringMVC</h3>
    <a href="account/findAll">ssm环境搭建与整合-----测试查询</a>
<h3>测试保存</h3>
    <form action="account/saveAccount" method="post">
        <input type="text" name="username"><br>
        <input type="text" name="money"><br>
        <input type="submit" value="保存"><br>
    </form>
</body>
</html>
