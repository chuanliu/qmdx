<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>管理员登录</title>
</head>
<FRAMESET border=0 frameSpacing=0 rows="75, *" frameBorder=0>
<FRAME name=admin_top src="admin_top.jsp" frameBorder=0 noResize scrolling=no>
<FRAMESET cols="170, *">
<FRAME name=left src="left.jsp" frameBorder=0 noResize>
<FRAME name=right src="right.jsp" frameBorder=0 noResize scrolling=yes>
</FRAMESET>
</FRAMESET>
<noframes>
</noframes>
<body background="images/login_bg.jpg">
<div>
欢迎观临
</div> 
<div>
<form action="" method="get">

</form>
</div>
</body>
</html>

