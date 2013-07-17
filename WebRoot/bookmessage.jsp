<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bookmessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
<body background="images/login_bg.jpg">
<s:form action="check.action" method="post">
<s:submit value="查看"></s:submit>
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
<s:iterator value="bo" id="item">
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

