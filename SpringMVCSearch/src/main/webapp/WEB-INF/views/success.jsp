<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<h1>Student name is ${studentEntity.name}</h1> 
<h1>Student id is ${ studentEntity.id}</h1>
<h1>Student date of birth is ${ studentEntity.date}</h1>
<h1>Student courses${ studentEntity.courses}</h1> 
<h1>Student gender is ${ studentvEntity.gender}</h1> 

<h1>Student street is ${ studentEntity.Address.street}</h1>
<h1>Student city is ${ studentEntity.Address.city}</h1>



</body>
</html>