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
			<h1><c:out value="${book.title}"/></h1>
			<a href="/home"> Back to the Shelves </a>
		</div>
		<div>
			<h3><span style="color: red;"><c:out value="${book.user.userName}"/></span> read 
			<span style="color: purple;"><c:out value="${book.title}"/></span> by 
			<span style="color: green;"><c:out value="${book.author}"/></span></h3>
		</div>
		<div>
			<h4>Here are <c:out value="${book.user.userName}"/>'s thoughts:</h4>
		</div>
		<div class="bookForm">
		<p class="thoughts">"<c:out value="${book.thoughts}"/>"</p>
		</div>
		<div>
		</div>
	</div>
</body>
</html>