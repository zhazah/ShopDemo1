<%@ page language="java" import="java.net.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<hr>
<%
	request.setCharacterEncoding("utf-8");
	String user_name="";
	String user_password="";
	Cookie [] cookies=request.getCookies();
	if(cookies!=null || cookies.length>0){
		for(Cookie c:cookies){
			if(c.getName().equals("user_name")){
				user_name=URLDecoder.decode(c.getValue(),"utf-8");
			}
			if(c.getName().equals("user_password")){
				user_password=URLDecoder.decode(c.getValue(),"utf-8");
			}
		}
	}
%>
用户名：<%=user_name %>
密码：<%=user_password %>

</body>
</html>