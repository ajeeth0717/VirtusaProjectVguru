<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<title>Student Login Page</title>
<script src=" https://kit.fontawesome.com/001d71f3e7.js "
	crossorigin="anonymous"></script>
<style>
body {
	background-image: url("loginimages.jpg");
	background-size: initial;
}

.container {
	opacity: 0.9;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container .row .vguru {
	display: flex;
	justify-content: justify;
	align-items: center
}
</style>
</head>
<body class="">
	<div class="container border border-primary rounded p-5 bg-white"
		style="box-shadow: 0 20px 40px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19); margin-top: 10%">
		<div class="row">
			<div class="col vguru text-center">
				<h2 class="display-4">
					<b>VGURU ONLINE TUTOR</b>
				</h2>
			</div>
			<div class="col">
				<h3 class="display-5">
					STUDENT LOGIN <i class="fas fa-user-graduate"></i>
				</h3>
				<hr>
				<form action="LoginStudent" class="form" method="POST">

					<label> EmailId : </label> <input type="email" class="form-control"
						name="Emailid" placeholder="Enter your Email Id" required><br>
					<label>PassWord :</label> <input type="password" name="Password"
						class="form-control" placeholder="Enter your Password" required><br>
					<button class="btn btn-primary">
						Login <i class="fa fa-sign-in" aria-hidden="true"></i>
					</button>
					<br> <br> Forgot your password <a
						href="ForgotpasswordStudent.jsp">click here</a>
					<hr>
					<div class="">
						<a href="CreateNewAccountStudent.jsp"> click here</a> to create a
						new account
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>





</body>

</html>