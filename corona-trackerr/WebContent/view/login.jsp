<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>Login</title>
</head>
<body>
<div class="container-login100" style="background-image: url('image/covid19.jpg');">
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<span class="fadeIn first">Admin Login</span>
			<form id="form-login" action="" method="post" onsubmit="return validateForm()">
				<input type="text" id="username" class="fadeIn second" name="login" placeholder="Username"> 
				<input type="password" id="password" class="fadeIn third" name="login" placeholder="Password">
				<div class="form-group">
							<div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
						</div>
				<input type="submit" id="submit" class="fadeIn fourth" value="Log In">
			</form>
		</div>
	</div>
	</div>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src = "js/login.js"></script>	
</body>
</html>