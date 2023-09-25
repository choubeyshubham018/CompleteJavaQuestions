<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
<h1 style="text-align: center;color: blue;">Product Details</h1>
<table align="center" border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Quantity</th>
</tr>
<tr>
<td align="center">${product.pid}</td>
<td align="center">${product.pname}</td>
<td align="center">${product.price}</td>
<td align="center">${product.qty}</td>
</tr>
</table>
</body>
</html>