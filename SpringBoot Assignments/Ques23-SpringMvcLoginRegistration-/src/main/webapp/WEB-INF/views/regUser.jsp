<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<h1 style="text-align: center;color: blue;">User Registration Page</h1>
<form action="/regisUser" method="post">
<table align="center">

<tr>
<th>Name</th>
<td><input type="text" name="name"/></td>
</tr>

<tr>
<th>UserId</th>
<td><input type="text" name="userId"/></td>
</tr>

<tr>
<th>Password</th>
<td><input type="password" name="password"/></td>
</tr>

<tr>
<th>Age</th>
<td><input type="text" name="age"/></td>
</tr>

<tr>
<th>Email</th>
<td><input type="text" name="email"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>

</form>

</body>
</html>