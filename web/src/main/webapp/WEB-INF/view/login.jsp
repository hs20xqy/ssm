<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@include file="common/head.jsp"%>
<html>
<head>
</head>
<body>
<div class="main">
  <form id="loginForm" action="${basePath}/user/login" method="post">
    <div>
      <label>用户名：</label>
      <input name="userName" type="text"/>
    </div>
    <div>
      <label>密码：</label>
      <input name="passWord" type="password"/>
    </div>
    <div>
      <button type="submit">登录</button>
      <button type="button">注册</button>
    </div>
  </form>
</div>
</body>
</html>
