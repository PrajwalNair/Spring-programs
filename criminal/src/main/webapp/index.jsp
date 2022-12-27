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
<script type="text/javascript">


</script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a > <img alt="" src="https://cdn.vectorstock.com/i/preview-1x/44/94/hacker-is-doing-cyber-crime-vector-44684494.jpg" width="100" height="75"> </a>
  <a style="padding-left: 0.5%;font-size: x-large;font-weight: bolder;font-style: oblique;padding-right: 0.5%;color: red;">CRIMINAL</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
    
      <a class="btn btn-success " href="search.jsp" role="button" style="font-variant: small-caps;font-style: oblique;font-size: x-large;font-weight: bolder;">Search</a>
      
   
  </div>
</nav>

<div class ="infopage">
<form action="criminal" method="post" enctype="multipart/form-data">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="name" id="inputEmail3" placeholder="Name" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Crime:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="crime" id="inputPassword3" placeholder="Crime" required="required">
    </div>
  </div>
   <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Total Years Awarded:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="totalYearsAwarded" id="inputPassword3" placeholder="Total Years Awarded" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Alias Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="aliasName" id="inputPassword3" placeholder="Alias Name">
    </div>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Description :</label>
    <textarea class="form-control" name="description" id="exampleFormControlTextarea1" rows="3" required="required"></textarea>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Jail Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="jailName" id="inputPassword3" placeholder="Jail Name">
    </div>
  </div>
  
  <label >File</label>
		<input type="file" name="file">
  
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Send</button>
    </div>
  </div>
</form>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>