<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 style="text-align: center;color: blue;">Login Page</h1>
<form action="/userLogin" method="get">
<table align="center" >
<tr>
<th>USER ID</th>
<td><input type="text" name="userId"/></td>
</tr>

<tr>
<th>PASSWORD</th>
<td><input type="password" name="password"/></td>
</tr>

<tr>
<th></th>
<td><input type="submit" value="Login"/></td>
</tr>


</table>
</form>

</body>
</html>