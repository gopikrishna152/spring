<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<h1>School</h1>
<h1>GOpikrishna</h1> 
<%
		String name=(String)request.getAttribute("name"); 
		List<String> fri=(ArrayList)request.getAttribute("friends"); 
		
	
%> 
<h1>name is <%=name %></h1>  


<%
	for(String s:fri){
		%><h1><%=s %></h1> 
	<% 	
	}
	
%>


<%
		

%>

</body>
</html>