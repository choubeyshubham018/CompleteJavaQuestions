<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1 style="text-align: center; color: blue;">Bloggin Page</h1>
<div style="display: flex; justify-content: center; height: 200px; flex-direction: column;align-items: center;">
<div style="padding: 10px; margin: 30px;">
<form action="./blog.jsp" method="post">
<input type="submit" value="Write Blog" style="height: 30px;width: 200px; color: black; background-color: yellow;" >
</form>
</div>
<div style="padding: 10px; margin: 30px;"method="post">
<form action="./blog?s1=not">
<input type="submit" value=" Read Blog" style="height: 30px;width: 200px;color: black; background-color: yellow;">
</form>
</div>
</div>
</body>
</html>