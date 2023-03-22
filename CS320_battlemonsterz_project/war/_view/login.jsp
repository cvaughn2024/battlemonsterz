<!DOCTYPE html>

<html>
	<head>
		<title>Login view</title>
	</head>

	<body>
		<!-- <a href= "addNumbers">Add numbers</a>
		<a href= "multiplyNumbers">Multiply numbers</a>
		<a href= "guessingGame"> Guessing Game</a>
		
		<button onclick="document.location='addNumbers'">Add Numbers</button>
		<button onclick="document.location='multiplyNumbers'">Multiply Numbers</button>
		<button onclick="document.location='guessingGame'">Guessing Game</button>-->
		
		<form action="${pageContext.servletContext.contextPath}/login" method = "post">
			<div>
			<input name = "create_account" type = "text" value = "Create Account">
			<input name = "login" type = "text" value = "Login">
			<input name = "submit" type = "submit" value = "Submit">
	
			</div>
		
		</form>
	</body>
</html>
