<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Read Share</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Change your Entry</h1>
			<a href="/home"> Back to the Shelves </a>
		</div>
		<div class="bookForm">
			<form:form action="/books/${book.id}/edit" method="POST" modelAttribute="book" class="form">
				<div>
					<form:label for="title" path="title">Title:</form:label>
					<form:errors path="title" class="error"/>
					<form:input type="text" path="author" class="form-control"/>
				</div>
				<div>
					<form:label for="author" path="author">Author:</form:label>
					<form:errors path="author" class="error"/>
					<form:input type="text" path="author" class="form-control"/>
				</div>
				<div>
					<form:label for="thoughts" path="thoughts">Thoughts:</form:label>
					<form:errors path="thoughts" class="error"/>
					<form:input type="textarea" path="thoughts" class="form-control"/>
				</div>
				<div>
					<form:errors path="user" class="error"/>
					<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>	
				</div>
				<br/>
				<div>
					<input type="submit" value="Submit" class="left"/>
				</div>
			</form:form> 
		</div>
	</div>
</body>
</html>