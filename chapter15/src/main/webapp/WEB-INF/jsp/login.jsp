<%--
  Created by IntelliJ IDEA.
  User: dongning
  Date: 2018/1/28
  Time: 下午9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath }/login"
          method="POST">
        用户名：<input type="text" name="username"/><br />
        密&nbsp;&nbsp;&nbsp;码：
        <input type="password" name="password"/><br />
        <input type="submit" value="登录" />
    </form>
</body>
</html>
