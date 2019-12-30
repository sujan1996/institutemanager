<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add New Course</title>
<body>
<form onsubmit="yourFunction()" id="your_form" method="post">
    Course Title: <input type="text", name="title"/> <br>
    Instructor ID: <input type="text", name="id" value=""/><br>
    <input type="submit", value="save">
</form>
<script>
function yourFunction(){
var action_src = "savecourse/" + document.getElementsByName("id")[0].value;
var your_form = document.getElementById('your_form');
your_form.action = action_src ;
}
</script>


</body>
</head>
</html>