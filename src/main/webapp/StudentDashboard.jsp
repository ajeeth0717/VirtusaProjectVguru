<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentDashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
</head>
<body>

<%
response.setHeader("cache-control","no-cache,no-store,must-revalidate");
if(session.getAttribute("email")==null)
{
	response.sendRedirect("login.jsp");
}
%>

<div class="container mt-5">
	<div class="row text-center mb-5">
		<div class="col">
			<h1 class="display-3">Welcome to Vguru  Online tutor</h1>
		</div>
	</div>
	
	<div class="row mb-5">
		<div class="col">
		 	<div class="card border border-primary mb-3" style="width: 80%;">
 				 <img src="sclact.jpg" class="card-img-top" alt="...">
  				<div class="card-body">
    			<h5 class="card-title">school Materials</h5>
    			<p class="card-text">1 Standard To 12 Standard Cbse and StateBoard Materials </p>
    			<a class="card-text btn btn-success" href="school.jsp">Go -></a>
 			 </div>
		</div>
		</div>
		
		<div class="col">
		<div class="card border border-primary mb-3" style="width: 80%;">
 				 <img src="sclact.jpg" class="card-img-top" alt="...">
  				<div class="card-body">
    			<h5 class="card-title">Previous Year BoardExam  Question Papers  </h5>
    			<p class="card-text"> For 10 and  12 Standards</p>
    			<a class="card-text btn btn-success" href="QuestionPapers.jsp">Go -></a>
 			 </div>
		</div>
		
	
	</div>
	<div class="row">
			<div class="col">
				<form action="Logout" method="POST">
					<input type="submit" class="btn btn-dark float-right" value="Logout">
				</form>
			</div>	
	</div>
</div>










<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js" integrity="sha384-XEerZL0cuoUbHE4nZReLT7nx9gQrQreJekYhJD9WNWhH8nEW+0c5qq7aIo2Wl30J" crossorigin="anonymous"></script>
</body>
</html>