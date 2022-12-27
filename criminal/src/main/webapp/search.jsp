<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Criminal-Home page</title>
<link rel="icon" href="https://toppng.com/uploads/preview/svg-black-and-whiteblack-building-symbol-home-tab-bar-icon-11553457635smpfpsanqx.png">
<style type="text/css">

.infopage{
	padding-left: 35%;
	padding-right: 35%;
	/* background-color: maroon; */
	padding-top: 5%;
	position: absolute;
	font-weight: bold;
	font-variant: small-caps;
	font-style: italic;
	font-family: sans-serif;
	font-size: large;
	
}


   
   

</style>


</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a > <img alt="" src="https://cdn.vectorstock.com/i/preview-1x/44/94/hacker-is-doing-cyber-crime-vector-44684494.jpg" width="100" height="75"> </a>
  <a style="padding-left: 0.5%;font-size: x-large;font-weight: bolder;font-style: oblique;padding-right: 0.5%;color: red;">CRIMINAL</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent" style="padding-left: 75%;">
      <a class="btn btn-success " href="index.jsp" role="button" style="font-variant: small-caps;font-style: oblique;font-size: x-large;font-weight: bolder;">Home</a>
  </div>
</nav>

<div class ="infopage">
<form action="criminal" method="get">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name" id="inputEmail3" placeholder="Name">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Jail Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="jailName" id="inputPassword3" placeholder="Jail Name">
    </div>
  </div>
  
  
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Search</button>
    </div>
  </div>
  
  
  
		
		<br>

		<div class="page" style="width: 30; height: 30">
			<table class="table table-striped table-dark" >
				<thead>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Crime </th>
						<th scope="col">Total Years Awarded</th>
						<th scope="col">Alias Name</th>
						<th scope="col">description</th>
						<th scope="col">jailName</th>
						<th scope="col">Image</th> 
						<th scope="col">File Name</th>
						<th scope="col">File Size</th>
						<th scope="col">Content Type</th>
						


					</tr>
				</thead>

				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.name}</td>
						<td>${dto.crime}</td>
						<td>${dto.totalYearsAwarded}</td>
						<td>${dto.aliasName}</td>
						<td>${dto.description}</td>
						<td>${dto.jailName}</td>
						<td><img  src="criminal/files/${dto.fileName}" width="100" height="150"> </td>
						<td>${dto.fileName}</td>
						<td>${dto.fileSize}</td>
						<td>${dto.contentType}</td>
						


					</tr>
				</c:forEach>




				</tbody>
			</table>
		</div>
		<p style="text-align: center; color: green;">${msg}</p>
  
  
</form>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>