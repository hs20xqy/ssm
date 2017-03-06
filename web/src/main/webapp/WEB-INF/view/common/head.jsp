<%--
  Created by IntelliJ IDEA.
  User: xqy
  Date: 2017/3/6
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
  request.setAttribute("basePath", basePath);
%>
