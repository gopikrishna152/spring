<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<%@include file="./base.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<title>Insert title here</title> 
<%@include file="./base.jsp" %>
</head>
<body> 


	<div class="contianer mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update product Details </h1>
				<form action="${pageContext.request.contextPath }/handle-product" method="post"> 
				<input type="text" value="${product.id }"> 
					<div class="form-group">
						<label for="name">Product Name</label><input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder=${product.name }>



					</div>
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" name="description" id="description"
							rows="5" placeholder=${ product.description }></textarea>
					</div> 
					<div class="form-group">
						<label for="price">Product Price</label>
						<textarea class="form-control" name="price" id="price"
							placeholder=${product.price }></textarea>
					</div>
					 
					<div class="container text-center">
					
						<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-warning"> Update</button>
						</div>
					
				</form>

			</div>
		</div>
	</div>



</body>
</html>