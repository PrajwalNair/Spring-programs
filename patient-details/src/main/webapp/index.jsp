<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<style type="text/css">
	
	.align{
	padding-left: 70%;
	}
	.data{
	text-align: center;
	font-size: large;
	font-style: italic;
	}
	form{
	font-style: italic;
	font-weight: bold;
	}
	
	body {
	/* background-image: url("https://images.adsttc.com/media/images/526d/66a6/e8e4/4ef4/c200/0588/slideshow/esto_2013AG13.538.jpg?1382901407");
	background-size: 100%;
	background-repeat: no-repeat; */
}


	</style>
	
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Edna_Adan_Maternity_Hospital_logo.svg/1606px-Edna_Adan_Maternity_Hospital_logo.svg.png" width="150" height="75">
		<a class="navbar-brand" href="#">Janata Hospital</a>
		<div class ="align">
		<a class="btn btn-secondary " href="Search.jsp" role="button">Search</a>
		</div>
	</nav>
	
	
	<h1>Enter the details</h1>
	<%-- <p style="text-align: center; color: green;">${msg}</p> --%>
	<p style="text-align: center; color: red;">${error}</p>
	<p style="text-align: center; color: red;">${error1}</p>
	<div class= "formback">
	<form action="send" method="post">
	<div class="data">
		
Name <input type="text" name="name" value="${dto.name}"> <br> <br>
Email <input type="text" name="email" value="${dto.email}"><br> <br>
Age <input type="text" name="age" value="${dto.age}"><br> <br>
Mobile No <input type="text" name="mobileNo" value="${dto.mobileNo}"><br><br>
		 
Gender <input type="radio" id="male" name="gender" value="Male">
		<label for="male">Male</label> 
		<input type="radio" id="female" name="gender" value="Female">
		<label for="female" >Female</label>
		<input type="radio" id="others" name="gender" value="Others">
		<label for="others" >Others</label><br>
Id Proof <select name="idProof">
		<option>----Select----</option>
		<option value ="Voter Id">Voter Id</option>
		<option value ="Aadhaar Card">Aadhaar Card</option>
		<option value ="Ration Card">Ration Card</option>
		<option value ="Pan Card">Pan Card</option>
		<option value ="DL">DL</option>
		
		</select> <br>
		<br>
Id Value <input type="text" name="idValue" value="${dto.idValue}"> <br> <br>
BPL Card <input type="radio" id="yes" name="bplCard" value="yes">
		<label for="yes" >Yes</label>
		<input type="radio" id="no" name="bplCard" value="no">
		<label for="no" >No</label><br>
Insurance <input type="radio" id="yes" name="insurance" value="yes">
		<label for="yes" >Yes</label>
		<input type="radio" id="no" name="insurance" value="no">
		<label for="no" >No</label><br>
			<input class="btn btn-secondary " type="submit" value="send" >
</div>
	</form>
	</div>

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