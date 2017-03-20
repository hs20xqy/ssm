<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@include file="../common/head.jsp"%>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="${basePath}/static/modules/user/user.css">
</head>
<body>
<div class="main">
  <form id="loginForm" class="loginForm" action="${basePath}/user/login" method="post">
    <div>
      <label>用户名：</label>
      <input name="userName" type="text"/>
    </div>
    <div>
      <label>密码：</label>
      <input name="password" type="password"/>
    </div>
    <div>
      <label>密码：</label>
      <input name="rePassWord" type="password"/>
    </div>
    <div>
      <label>邮箱：</label>
      <input name="email" type="text"/>
    </div>
    <div>
      <button type="button">注册</button>
    </div>
  </form>
</div>
</body>
</html>
