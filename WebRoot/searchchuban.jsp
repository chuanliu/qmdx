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
     根据出版社查找<br>
    <s:form action="searchpublish.action" method="post">
    <s:label>请输入您要查找的出版社</s:label>  
    <s:fielderror></s:fielderror>
    <s:textfield name="publish" id="nameid"></s:textfield>
    <s:submit value="查找"></s:submit>  
<table>
<tr>
<td width="80">
  <div align="left">图书编号  </div></td>
<td width="80">
  <div align="left">图书书名  </div></td>
<td width="80">
  <div align="left">图书作者  </div></td>
<td width="80">
  <div align="left">图书类型  </div></td>
<td width="130">
  <div align="left">图书出版社 </div></td>
<td width="130">
  <div align="left">图书内容  </div></td>
</tr>
<s:iterator value="book" id="item">
<tr>
<td>
  <div align="left"><s:property value="#item.bookId"/></div></td>
<td>
  <div align="left"><s:property value="#item.bookName"/></div></td>
<td>
  <div align="left"><s:property value="#item.bookAuthor"/></div></td>
<td>
  <div align="left"><s:property value="#item.bookType"/></div></td>
<td>
  <div align="left"><s:property value="#item.bookPublish"/> </div></td>
<td>
  <div align="left"><s:property value="#item.bookContent"/> </div></td>
</tr>
</s:iterator>
</table>    
  </s:form>
</body>
</html>
