

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="card mx-auto mt-5 bg-secondary" style="width: 80%">
				<div class="card-body py-5">
					<h3 class="text-center text-white">Complex Form</h3>
					<div class="alert alert-danger" role="alert">A simple danger
						alert—check it out!
						<form:errors path="studententity.*" />						
						
						</div>
					<form action="process/{gopikrishna}" class="mt-3" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1">Your name</label> <input
								type="text" name="name" placeholder="enter name"
								class="form-control"> <small id="emailHelp"
								class="form-text text-muted ">we will neever share</small>



						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Your id</label> <input
								type="text" name="id" id="enter Id" class="form-control">
							<small id="emailHelp" class="form-text text-muted ">we
								will neever share</small>



						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Your DOB</label> <input
								type="text" name="date" placeholder="enter date of birth ddmmyy"
								class="form-control"> <small id="emailHelp"
								class="form-text text-muted ">we will never share</small>



						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Select courses</label> <select
								name="courses" class="form-control"
								id="exampleFormControlSelect1" multiple>
								<option>Java</option>

								<option>Python</option>
								<option>JavaScript</option>
								<option>spring</option>
								<option>datastructures</option>
								<option>Databases</option>


							</select>



						</div>


						<div class="form-group">
							<span class="mr-3">Select Gender</span>
							<div class="form-check form-check-inline">
								<input class="form-check-input" name="gender" type="radio"
									id="inlineRadio1" value="male"> <label
									classd="form-check-label" for="inlineRadio1">Male</label>


								<div class="form-check form-check-inline">
									<input class="form-check-input" name="gender" type="radio"
										id="inlineRadio2" value="female"> <label
										classd="form-check-label" for="inlineRadio2">Female</label>


								</div>
							</div>
							<div class="form-group">

								<label for="">SelectType </label> <select class="form-control"
									name="type"><option value="oldstudent">Old
										Student</option>
									<option value="newstudent">NewStudent</option></select>

							</div>
							<div class="card">

								<div class="card-body">
									<p>your Address</p>
									<div class="form-group">
										<input type="text" class="form-control" name="address.street"
											placeholder="enter your street">
									</div>
									<div class="form-group">
										<input type="text" class="form-control" name="address.city"
											placeholder="enter your city">
									</div>

								</div>














								<div class="container text-center">
									<button class="btn btn-outline-light">Search</button>

								</div>
					</form>

				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>