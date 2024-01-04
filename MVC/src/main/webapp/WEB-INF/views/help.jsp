<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@page  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<h1>Hello this is hello page</h1>
<%-- <%
		String name=(String)request.getAttribute("name"); 
		Integer i=(Integer)request.getAttribute("id");

%>
 <%=name %> 
 <%=i %> --%>  
 <h1>
 ${ name } </h1><h1> 
 ${ id }
 </h1> 
 <hr>
<%-- <h1>${marks }</h1> --%>

</body>
</html>