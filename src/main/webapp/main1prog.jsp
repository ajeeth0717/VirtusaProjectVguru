<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
.dropdown-submenu {
  position: relative;
}

.dropdown-submenu .dropdown-menu {
  top: 0;
  left: 100%;
  margin-top: -1px;
}
</style>
</head>
<body>
   
<div class="container">
    <div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Tutorials
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li class="dropdown-submenu">
        <a class="test" tabindex="-1" href="#">CBSE <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="dropdown-submenu">
            <a class="test" href="#">class 1 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">maths</a></li>
              <li><a href="#">science</a></li>
            </ul>
            <a class="test" href="#">class 2 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">maths</a></li>
              <li><a href="#">science</a></li>
            </ul>
          </li>
        </ul>
         <a class="test" tabindex="-1" href="#">STATEBOARD <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="dropdown-submenu">
            <a class="test" href="#">class 1 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">maths</a></li>
              <li><a href="#">science</a></li>
            </ul>
            <a class="test" href="#">class 2 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">maths</a></li>
              <li><a href="#">science</a></li>
            </ul>
          </li>
        </ul>
      </li>
    </ul>
    
  </div>
</div>

<script>
$(document).ready(function(){
  $('.dropdown-submenu a.test').on("click", function(e){
    $(this).next('ul').toggle();
    e.stopPropagation();
    e.preventDefault();
  });
});
</script>
</body>
</html>
 