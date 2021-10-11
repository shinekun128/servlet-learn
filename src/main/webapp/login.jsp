<%--
  Created by IntelliJ IDEA.
  User: 坤~
  Date: 2021/10/10
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8082/login" method="get">
    用户名：<input type="text" name="username" value="${cookie.username.value}"><br/>
    密 码：<input type="text" name="password" value=""><br/>
    <input type="submit" value="登陆">
</form>
</body>
</html>
