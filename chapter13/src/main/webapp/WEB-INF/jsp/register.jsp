<%--
  Created by IntelliJ IDEA.
  User: dongning
  Date: 2018/1/23
  Time: 上午9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/registerUser"
      method="post">
    用户名：<input type="text" name="username" /><br />
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br />
    <input type="submit" value="注册"/>
</form>
</body>
</html>

