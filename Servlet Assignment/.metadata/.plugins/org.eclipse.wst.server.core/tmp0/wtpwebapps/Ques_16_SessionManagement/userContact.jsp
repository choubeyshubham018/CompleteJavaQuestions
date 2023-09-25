<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Details</title>
</head>
<body>
<h2 style="text-align: center; color: blue;">User Contact Details</h2>
<form action="./user/display" method="get">
<table align="center" border="1px">
<tr>
<th> User Name</th>
<td><%= session.getAttribute("uname") %></td>
</tr>
<tr>
<th> Age</th>
<td><%= session.getAttribute("uage") %></td>
</tr>
<tr>
<th> City</th>
<td><%= session.getAttribute("city") %></td>
</tr>
<tr>
<th>State</th>
<td><%= session.getAttribute("state") %></td>
</tr>
<tr>
<th>Phone Number</th>
<td> <input type="number" name="phone"></td>
</tr>
<tr>
<th>Email</th>
<td> <input type="email" name="email"></td>
</tr>
<tr>
<th></th>
<td> <input type="submit" value="Submit"></td>
</tr>
</table>
</form>

</body>
</html>