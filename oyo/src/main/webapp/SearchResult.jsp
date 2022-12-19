<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oyo</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-image:
		url("https://img.etimg.com/thumb/width-1200,height-900,imgsize-272348,resizemode-1,msid-72192946/industry/services/hotels-/-restaurants/over-500-hotels-in-100-cities-may-have-checked-out-of-oyo-since-april.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}

form {
	text-align: center;
}
pre {
	color: white;
	font-weight: bold;
	font-size: large;
}
h1 {
	text-align: center;
}
</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Oyorooms-branding.svg/1200px-Oyorooms-branding.svg.png" width="150" height="75">
		<a class="navbar-brand" href="#">OYO</a>
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
					<th scope="col" style="color: blue;">Location</th>
					<th scope="col">State</th>
					<th scope="col">Customer Name</th>
					<th scope="col">Age</th>
					<th scope="col">Fees</th>
					<th scope="col">Pincode</th>
					<th scope="col">Contact No</th>
					<th scope="col">No Of Rooms</th>
					
				</tr>
			</thead>
			
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.location}</td>
					<td>${dto.state}</td>
					<td>${dto.customerName}</td>
					<td>${dto.age}</td>
					<td>${dto.fees}</td>
					<td>${dto.pincode}</td>
					<td>${dto.contactNo}</td>
					<td>${dto.noOfRooms}</td>
					
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