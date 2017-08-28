<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/27
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<c:set value="${request.contextPath}" var="blog" />

<!-- 下面是easyui的环境 -->
<link rel="stylesheet" href="${blog}/static/jquery-easyui-1.5.2/themes/icon.css" type="text/css"></link>
<link rel="stylesheet" href="${blog}/static/jquery-easyui-1.5.2/themes/metro/easyui.css" type="text/css"></link>
<script type="text/javascript" src="${blog}/static/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${blog}/static/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${blog}/static/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>
