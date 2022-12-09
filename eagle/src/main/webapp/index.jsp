<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>IceCream</title>
<style type="text/css">
body {
	background-image:
		url("https://images.unsplash.com/photo-1629385697093-57be2cc97fa6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjB8fHxlbnwwfHx8fA%3D%3D&w=1000&q=80");
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;

</style>

</head>
<body>
	<nav class="navbar navbar-dark bg-info">
		<a class="navbar-brand" href="#"> <img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfBzrD8sCtIwofyhdxX_zf6R7FVeaf0_5gjQ&usqp=CAU"
			width="150" height="75"> IceCream Studio
			
		</a>
	</nav>
	<h1>Ice cream information</h1>
	<form action="send" method="post">
		<h4>
			<pre>
Type <input type="text" name="type"><br>
Brand <input type="text" name="brand"><br>
Flavour <input type="text" name="flavour"><br>
Price <input type="text" name="price"><br>
Quantity <input type="text" name="quantity"><br><br>
<input type="submit" value="send" class="btn btn-success">
<marquee>East or West IceCream is the best</marquee>

</pre>
		</h4>

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