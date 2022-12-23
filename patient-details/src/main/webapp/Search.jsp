<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
.align {
	padding-left: 70%;
}
form{
	text-align: center;
}

.detail {
	text-align: center;
}
body {
	/* background-image: url("https://images.adsttc.com/media/images/526d/66a6/e8e4/4ef4/c200/0588/slideshow/esto_2013AG13.538.jpg?1382901407");
	background-size: 100%;
	background-repeat: no-repeat; */
}

.page {
	position: absolute;
	left: 15%;
	top: 50%;
}

form{
font-size: large;
font-style: italic;
font-weight: bolder;
}
table {
	font-size: medium;
	text-align: left;
	font-weight: normal;
}
/* .formback{
background: maroon;
} */


</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<img alt=""
			src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Edna_Adan_Maternity_Hospital_logo.svg/1606px-Edna_Adan_Maternity_Hospital_logo.svg.png"
			width="150" height="75"> <a class="navbar-brand" href="#">Janata
			Hospital</a>
		<div class="align">
			<a class="btn btn-secondary " href="index.jsp" role="button">Home</a>
		</div>
	</nav>


	<h1 style="text-align: center;">Search Page</h1>

<div class= formback>
	<form action="send" method="get">
		<div class="detail">
			
Name :<input type="text" name="name"> <br><br>
			
Age  :<input type="text" name="age"><br><br>
		

			<input type="submit" value="Search">
		</div>
		<br>

		<div class="page" style="width: 30; height: 30">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">Id </th>
						<th scope="col">Image </th>
						<th scope="col">Name</th>
						<th scope="col">Email Id</th>
						<th scope="col">Age</th>
						<th scope="col">Mobile No</th>
						<th scope="col">Gender</th>
						<th scope="col">Id Proof</th>
						<th scope="col">BPL Card</th>
						<th scope="col">Id Proof</th>
						<th scope="col">Id value</th>
						<th scope="col">File Size</th>
						<th scope="col">Content Type</th>


					</tr>
				</thead>

				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.id}</td>
						<td><img  src="send/files/${dto.fileName}" width="100" height="150"> </td>
						<td>${dto.name}</td>
						<td>${dto.email}</td>
						<td>${dto.age}</td>
						<td>${dto.mobileNo}</td>
						<td>${dto.gender}</td>
						<td>${dto.idProof}</td>
						<td>${dto.idValue}</td>
						<td>${dto.bplCard}</td>
						<td>${dto.insurance}</td>
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