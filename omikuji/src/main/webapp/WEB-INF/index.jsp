<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/app.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Send an Omikuji!</h1>
		<div class="formBox">
			<form action="/formSubmit" method="post" class="form-control">
				<div>
					<label for="number">Pick any number from 5 to 25.</label>
					<br />
					<input type="number" name="number" />
				</div>
				<br />
				<div>
					<label for="city">Enter the name of any city.</label>
					<br />
					<input type="text" name="city" />
				</div>
				<br />
				<div>
					<label for="person">Enter the name of any real person.</label>
					<br />
					<input type="text" name="person"/>
				</div>
				<br />
				<div>
					<label for="hobby">Enter professional endeavor or hobby.</label>
					<br />
					<input type="text" name="hobby"/>
				</div>
				<br />
				<div>
					<label for="creature">Enter any type of living thing.</label>
					<br />
					<input type="text" name="creature"/>
				</div>
				<br />
				<div>
					<label for="somethingNice">Say something nice to someone:</label>
					<br />
					<textarea name="somethingNice"></textarea>
				</div>
				<br />
				<div>
					<p>Send and show a friend!</p>
				</div>
				<input type="submit" value="Send" class="buttonSubmit" />
			</form>
		</div>
	</div>
</body>
</html>