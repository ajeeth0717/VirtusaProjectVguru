<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TeacherDashBoard</title>
<script src=" https://kit.fontawesome.com/001d71f3e7.js " crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<style>
.container{
margin-top:10%;
}
a i:hover{
text-shadow: 0 0 3px #FF0000, 0 0 5px #0000FF;
}
</style>


</head>
<body>
<%
if(session.getAttribute("email")==null)
{
	response.sendRedirect("TeacherLogin.jsp");
}
%>

<div class="container border border-primary rounded p-3">
<form action="LogoutTeacher" method="post">
<p class="display-2">
click <a href="https://script.google.com/macros/s/AKfycbxZHRp8TgTMN3eh0cbF5v0taW4fS60QoANta0F5zEdh7D71F8bK/exec"> <i class="fas fa-cloud-upload-alt"></i></a> to upload a file
</p>
<input class="btn btn-dark" type="submit" value="Logout" >

</form>
</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>