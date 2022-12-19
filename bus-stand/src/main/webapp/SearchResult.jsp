<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Stand</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-image:
		url("https://etimg.etb2bimg.com/photo/91180481.cms");
	background-repeat: no-repeat;
	background-size: 100%;
}

form {
	text-align: center;
}
pre {
	color: black;
	font-weight: bold;
	font-size: large;
}
p {
	font-size: large;
	font-weight: bolder;
	font-style: italic;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">MyBusApp</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only">(current)</span></a> <a class="nav-item nav-link"
					href="#">Features</a> <a class="nav-item nav-link" href="#">Pricing</a>
				<!-- <a class="nav-item nav-link disabled" href="#">Disabled</a> -->
			</div>
		</div>
	</nav>
	<p style="text-align: center; color: green;">${msg}</p>
	
	
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col" style="color: blue;">Name</th>
					<th scope="col">No Of Busses</th>
					<th scope="col">Location</th>
					<th scope="col">No Of Platform</th>
					<th scope="col">No Of Shop</th>
					<th scope="col">City</th>
					
				</tr>
			</thead>
			
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.name}</td>
					<td>${dto.noOfBusses}</td>
					<td>${dto.location}</td>
					<td>${dto.noOfPlatform}</td>
					<td>${dto.noOfShop}</td>
					<td>${dto.city}</td>
					
				</tr>
			</c:forEach>	


				
				
			</tbody>
		</table>



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