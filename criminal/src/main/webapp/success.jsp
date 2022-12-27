<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="criminal" method="post">
  

<!-- <div class="d-none d-print-block"> -->
<pre>
Name :${dto.name}
Crime:${dto.crime}
Total Years Awarded :${dto.totalYearsAwarded}
Alias Name :${dto.aliasName}
Description :${dto.description}
Jail Name :${dto.jailName}
Image: <img  src="criminal/files/${dto.fileName}" width="100" height="150">
</pre>
<!-- </div> -->
  
</form>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>