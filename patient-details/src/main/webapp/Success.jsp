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
	.details{
	text-align: center;
	}
	
	form{
	font-size: large;
	font-style: italic;
	font-weight: bold;
	}
	
	</style>
	
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Edna_Adan_Maternity_Hospital_logo.svg/1606px-Edna_Adan_Maternity_Hospital_logo.svg.png" width="150" height="75">
		<a class="navbar-brand" href="#">Janata Hospital</a>
		<div class ="align">
		<a class="btn btn-secondary " href="index.jsp" role="button">Home</a>
		</div>
	</nav>
	
	
	<h1>Patient Details</h1>
	
	
	<form action="send" method="post">
	<div class="details">
		<pre>
Name :${dto.name} <br>
Image: <img  src="send/files/${dto.fileName}" width="100" height="150">
Email :${dto.email}<br>
Age :${dto.age}<br>
Mobile No :${dto.mobileNo} <br>
Gender :${dto.gender} <br>
Id Proof :${dto.idProof} <br>
Id Value :${dto.idValue} <br>
Id Value :${dto.bplCard} <br>
Id Value :${dto.insurance} 
	</pre>	
	</div> 
		<p style="text-align: center; color: green;">${msg}</p>	

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