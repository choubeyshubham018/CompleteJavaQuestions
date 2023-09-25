<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
<h2 style="text-align: center; color: blue;">User Complete Details</h2>
<table border="1px" align="center">
<tr>
<th> User Name</th>
<td><%= session.getAttribute("uname")%></td>
</tr>
<tr>
<th> Age</th>
<td><%= session.getAttribute("uage")%></td>
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
<th> Phone Number</th>
<td><%= session.getAttribute("phone")%></td>
</tr>
<tr>
<th>Email</th>
<td><%= session.getAttribute("email") %></td>
</tr>
</table>
<div style="display: flex; align-items: center;justify-content: center;"><a href="index.html" style="text-decoration: none;background-color: yellow;"></a></div>

</body>
</html>