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

<a href="/newinstructor">Add New Instructor Here</a>

<table border="1">
    <thead>
    <th>ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email</th>
    <th>Channel</th>
    <th>Hobby</th>
    <th>Delete</th>
    </thead>

    <tbody>
    <c:forEach items="${instructors}" var="ins" varStatus="i">

        <tr>
            <td><c:out value="${i.index+1}"></c:out></td>
            <td><c:out value="${ins.firstName}"></c:out></td>
            <td><c:out value="${ins.lastName}"></c:out></td>
            <td><c:out value="${ins.email}"></c:out></td>
            <td><c:out value="${ins.instructorDetail.channel}"></c:out></td>
            <td><c:out value="${ins.instructorDetail.hobby}"></c:out></td>
            <td><a href="/deleteinstructor/${ins.id}", onclick="return confirm('Delete?')">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>
<table border="1">
    <thead>
    <th>ID</th>
    <th>Title</th>
    <th>Instructor Id</th>
    <th>Delete</th>
    </thead>
    <tbody>
    <c:forEach items="${instructors}" var="instructor" varStatus="i">
    <tr>
        <td><c:out value="${i.index+1}"></c:out></td>
        <td><c:out value="${instructor.courses.title}"></c:out></td>
        <td><c:out value="${instructor.id}"></c:out></td>
        <td><a href="/deletecourse/${instructor.id}" onsubmit="return confirm('Sure?')"></a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>