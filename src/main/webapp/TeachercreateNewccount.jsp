<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Create New Account</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src=" https://kit.fontawesome.com/001d71f3e7.js " crossorigin="anonymous"></script>
<style>
body{
background-color: rgb(252,212,252);
}
.newacc{
margin-top:5%;
}
</style>
</head>
<body>
<div class="container newacc" >
<h2>Create New account <i class="fas fa-user-plus"></i></h2>
<hr>
<div class="container bg-white border border-primary rounded p-4">
	<form action="CheckaccountTeacher" method="POST">
		<div class="form-group">
		<label> Name :</label>
		<input type="text" name="Name" class="form-control" placeholder="Enter your Name">
		 </div>
		 <div class="form-group">
		<label>EmailID:</label> <input type="text" name="EmailId" class="form-control" placeholder="Enter your Email">
		</div> 
		<div class="form-group">
		<label>Password
		:</label><input type="text" name="Password" class="form-control" placeholder="Enter your Password">
		</div>
		<div class="form-group">
		 <label>Age :</label>
		 <input type="text" name="age" class="form-control" placeholder="Enter your age">
			</div>
		<div class="form-group">
		<label>Gender :</label><input type="text" name="gender" class="form-control" placeholder="Enter your Gender">
		</div>
		<div class="form-group"> 
		<input type="submit" value="Submit" class="btn btn-primary">
		</div>
	</form>
	
	</div>
	
</div>	
	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>