<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<style>
.container-fluid{
border-bottom-left-radius:150px;
border-bottom-right-radius:150px;
background-color: rgb(252,212,252);
border-bottom: 4px solid grey;
}
body {
	background-image: url("c.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

a img {
	opacity: 0.5;
}

a img:hover {
	opacity: 1.0;
}

body .main {
	margin-top: 7%;
}
</style>
</head>
<body>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
	%>
	<div class="container-fluid text-center">
		<h1 class="display-1">VGURU ONLINE TUTOR</h1>
	</div>
	
	<div class="container text-center main">
		<div class="row">
			<div class="col">
				<h1>Your are</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 col-xl-6 mt-3">
				<div class="container">
					<a href="StudentLogin.jsp"><img src="studimage.jpg"
						style="width: 95%"></a>
				</div>
			</div>
			<div class="col-xs-12 col-xl-6 mt-3">
				<div class="container">
					<a href="TeacherLogin.jsp"><img src="t.jpg" style="width: 95%"></a>
				</div>
			</div>
		</div>

	</div>




	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
	s
</body>
</html>