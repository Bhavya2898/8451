<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str = "Hello everyone";
	String str1 = "Hi";

%>
<h1><%= str %></h1>
<center>
	<%
		for(int i=1;i<=6;i++){
	%>
	<font size="<%=i %>">Hello World</font><br/>
	<%
		}
	%>	
	
</center>

<%--
<?php
		$str = 'Hello Everyone';
		echo '<h1>'.str.'</h1>;'
		
--%>

</body>
</html>