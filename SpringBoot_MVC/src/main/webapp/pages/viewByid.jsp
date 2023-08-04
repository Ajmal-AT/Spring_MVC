<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Option Id</title>
</head>
<body style=" background: olive;">
	<div>
		<div class="nav" style="width:100%; display: flex;">
			<a href="home" style="text-decoration: none; color: black; padding: 5px; margin-left: 10px;">Home</a>
			<a href="view" style="text-decoration: none; color: black; padding: 5px; margin-left: 10px;">View</a>
		</div>
	</div>
	<div class="homecontents" style="margin-top: 15%;">
		<center>
			<form action="displayId" method="post">
				Enter Id : <input type="number" name="u_id" style="margin-bottom: 10px;" >
				<center> <input type="submit" value="Ok" style="border-radius: 10px; padding: 5px; width: 60px;"> </center>
			</form>
		</center>
	</div>
</body>
</html>