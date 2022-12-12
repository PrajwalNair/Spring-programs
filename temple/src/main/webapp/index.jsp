<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Temple</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
a {
	text-align: left;
	color: white;
}

body {
	background-image:
		url("https://www.keralatourism.org/images/temple/video/thumb/Ananthapura_Lake_Temple,_Kasaragod-01012020151755.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
form {
	text-align: center;
	
}
pre {
	color: background;
	font-size: large;
	font-style: italic;
	font-weight: bold;
}
h1 {
	text-align :center;
	font-weight: bold;
	font-style: italic;
	color: maroon;
}
input {
	opacity:0.8;
}
select{
opacity: 0.8;
}
a {
	font-style: italic;
}

</style>

</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<img alt="" src="https://i0.wp.com/meditativemind.org/wp-content/uploads/2018/11/OM-Mantra-Symbol-Meaning.jpg?fit=900%2C584&ssl=1" width="150" height="75" style="border: thick;">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo01"
			aria-controls="navbarTogglerDemo01" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">&nbsp;&nbsp;
			<a class="navbar-brand" href="#" style="color: orange;">Kedarnath</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="https://www.google.com/search?q=temple+images&rlz=1C1GCEA_enIN1011IN1011&oq=temple+&aqs=chrome.0.69i59j69i57j46i131i433i512l2j0i512j46i131i175i199i433i512j0i433i512j0i131i433i457i512j0i402l2.3832j0j15&sourceid=chrome&ie=UTF-8">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-light my-2 my-sm-0" type="submit" style="font-style: oblique;font-weight: bold;font-style: italic; ">Search</button>
			</form>
		</div>
	</nav>
	<h1>Please Enter The Details</h1> <br>
	<p style="color: green;font-weight: bolder;font-style: italic;font-size: x-large;text-align: center; text-decoration: underline;">${msg}</p>
	<p style="color: red;font-weight: bolder;font-style: italic;font-size: x-large;text-align: center;text-decoration: underline;">${error}</p>
	<form action="send" method="post">
	<pre>
		Name<input type="text" name="name" value="${dto.name}"> <br>
		Location <select name="location" value="${dto.location}">
			<option value="---Select---">---Select---</option>
			<option value="kerala">kerala</option>
			<option value="karnataka">karnataka</option>
			<option value="Maharashtra">Maharashtra</option>
			<option value="Tamil Nadu">Tamil Nadu</option>
			<option value="Delhi">Delhi</option>

		</select> <br>
		MainGod <select name="mainGod" value="${dto.mainGod}">
			<option value="---Select---">---Select---</option>
			<option value="Shiva">Shiva</option>
			<option value="Hanuman">Hanuman</option>
			<option value="Durga Devi">Durga Devi</option>
			<option value="Chowdeshwari">Chowdeshwari</option>
			<option value="Ganesh">Ganesh</option>

		</select> <br>
		Pincode <select name="pincode" value="${dto.pincode}">
			<option value="---Select---">---Select---</option>
			<option value="580021">580021</option>
			<option value="580022">580022</option>
			<option value="580023">580023</option>
			<option value="580024">580024</option>
			<option value="580025">580025</option>

		</select><br>
		Fees<input type="text" name="fees" value="${dto.fees}"><br>
		Open Time<input type="text" name="openTime" value="${dto.openTime}"><br>
		Close Time<input type="text" name="closeTime" value="${dto.closeTime}"><br>
		<input type="submit" value="submit" style="font-style: italic; font-weight: bolder; background: green; border: thin;opacity: inherit;">
		
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