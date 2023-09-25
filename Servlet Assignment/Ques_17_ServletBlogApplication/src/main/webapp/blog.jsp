<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogging Page</title>
</head>
<body>
<h2 style="text-align: center; color: blue;"> Blog Details</h2>
<div style="border: 1px solid; padding: 10 px;  border-color: blue;height: 600px; width: 900px; margin: 50px; margin-left: 300px;">
<h3 style="text-align: center;">Enter details below</h3>
<form action="./blog?s1=save" method="post">
<table align="center" width="400 px" style="margin-top: 20px;">
<tr>
	<th>Blog ID  </th>
	<td><input type="text" name="bid"></td>
</tr>

<tr>
	<th>Title  </th>
	<td><input type="text" name="title"></td>
</tr>
<tr>
	<th>Description  </th>
	<td><input type="text" name="description"></td>
</tr>
<tr>
	<th>Content</th>
	<td><textarea rows="20" cols="30" name="content"></textarea></td>
</tr>
<tr>
<td style="align-self: center"></td>
<td >
<input type="submit" value="SUBMIT" >
</td>
</tr>
</table>
</form>
</div>
</body>
</html>