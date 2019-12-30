<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
<form action="saveinstructor", method="post">
    First Name: <input type="text", name="firstName"/> <br>
    Last Name: <input type="text", name="lastName"/><br>
    Email: <input type="text", name="email"/><br>
    <br>
    Channel: <input type="text", name="channel"/> <br>
    Hobby: <input type="text", name="hobby"/> <br>
    <input type="submit", value="save">
</form>
</body>
</html>