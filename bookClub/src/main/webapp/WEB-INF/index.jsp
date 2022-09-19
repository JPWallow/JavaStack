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
	   <h1 style="color: purple">Book Club</h1>
	   <p>A place for friends to share thoughts on books.</p>
	   <div class="column">
			<div class="formBox">
				<h1>Register</h1>
				<div>
					<form:form method="POST" action="/register" modelAttribute="newUser"  class="form-control">
						<div>
							<form:label path="userName">User Name: </form:label>
							<form:errors path="userName"/>
							<form:input path="userName"/>
						</div>
						<br/>
						<div>
							<form:label path="email">Email:</form:label>
							<form:errors path="email"/>
							<form:input path="email"/>
						</div>
						<br/>
						<div>
							<form:label path="password">Password: </form:label>
							<form:errors path="password"/>
							<form:input type="password" path="password"/>
						</div>
						<br/>
						<div>
							<form:label path="confirm">Confirm Password</form:label>
							<form:errors path="confirm"/>
							<form:input type="password" path="confirm"/>
						</div>
						<br/>
						<button> Submit </button>
					</form:form>
				</div>
			</div>
			<div class="formBox">
				<h1>Log in</h1>
					<form:form method="POST" action="/login" modelAttribute="newLogin"  class="form-control">
						<div>
							<form:label path="email">Email: </form:label>
							<form:errors path="email"/>
							<form:input path="email"/>
						</div>
						<br/>
						<div>
							<form:label path="password">Password: </form:label>
							<form:errors path="password"/>
							<form:input type="password" path="password"/>
						</div>
						<br/>
						<button>Submit</button>
					</form:form>
			</div>
	   </div>
	</div>	   
</body>
</html>