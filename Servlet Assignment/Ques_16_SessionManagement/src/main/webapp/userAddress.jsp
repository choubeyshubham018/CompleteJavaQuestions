<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
</head>
<body>
<h2 style="text-align: center; color: blue;">User Address Details</h2>
<form action="./user/address" method="get">
<table align="center" border="1px">
<tr>
<th>User Name</th>
<td><%= session.getAttribute("uname") %></td>
</tr>
<tr>
<th> Age</th>
<td><%= session.getAttribute("uage") %></td>
</tr>
<tr>
<th> City</th>
<td> <input type="text" name="city"></td>
</tr>
<tr>
<th>State</th>
<td> <input type="text" name="state"></td>
</tr>
<tr>
<th></th>
<td> <input type="submit" value="Submit"></td>
</tr>
</table>
</form>

</body>
</html>