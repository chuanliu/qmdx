<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addbook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
	 function check(){
	 alert("操作中");
	 }
	 function checkname(){
	 var name=document.getElementById("nameid").value;
	 if(name.length>10){
	    alert("书名过长");
	    return false;
	 }
	 return true;
	 }
	</script>
  </head>
<body background="images/login_bg.jpg">
    <s:form action="addbook.action" method="post">
        <s:textfield name="name" id="nameid" onchange="return checkname()"label="图书书名" />
        <s:textfield name="author" label="图书作者" />
        <s:textfield name="type" label="图书类型" />
        <s:textfield name="publish" label="图书出版社" />
        <s:textfield name="content" label="图书内容" />
        <s:submit onclick="check()" value="添加" />
    </s:form>
</body>
</html>
