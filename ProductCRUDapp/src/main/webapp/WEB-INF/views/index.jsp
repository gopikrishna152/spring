<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col md-12">
				<h1 class="text-center mb-3">Welcome to product App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody> 
					
					<c:forEach items="${ products}" var="p">
						<tr>
							<th scope="row">TECHNOLOGY${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description}</td>
							<td><b>₹${p.price }</b></td>  
							<td>
							<a href="delete/${p.id }"> <i class="fas fa-trash-alt" style="font-size:30px"></i></a> 
							<a href="update/${p.id }"> <i class="far fa-edit" style="font-size:30px"></i></a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>


				<div class="contaienr text-center">
					<a href="add-product" class="btn btn-outline-success">Add</a>
				</div>
			</div>

		</div>
	</div>








</body>
</html>