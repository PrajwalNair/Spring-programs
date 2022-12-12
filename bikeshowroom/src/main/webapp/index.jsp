<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike showroom</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-image:
		url("https://rukminim1.flixcart.com/image/416/416/poster/5/4/r/large-harley-3940-harley-davidson-racing-bike-poster-original-imaerxcpgbuhbaht.jpeg?q=70");
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
</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<a class="navbar-brand" href="#">Bike ShowOff</a>
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
	<h1>Enter the details</h1>
	<p style="text-align: center; color: green;">${msg}</p>
	<p style="text-align: center; color: red;">${error}</p>
	<form action="send" method="post">
		<pre>
		Brand<input type="text" name="brand" value="${dto.brand}"> <br>
		Owner Name<input type="text" name="ownerName" value="${dto.ownerName}"><br>
		Location<input type="text" name="location" value="${dto.location}"><br>
		Ambassador<input type="text" name="ambassador"
				value="${dto.ambassador}"> <br>
			Description<input type="text" name="description" value="${dto.description}"><br>
			 
			<input type="submit" value="send">
</pre>
	</form>

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