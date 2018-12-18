<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body background="https://d2v9y0dukr6mq2.cloudfront.net/video/thumbnail/Sjgjhp3zeiw5hayru/motion-graphics-of-3d-abstract-geometric-shape-transformation-background_r8yz0ejie_thumbnail-full01.png">
	<br>
	<br>

	<div class="container" style="text-align: center">
	<h2>Please Register as a User!</h2>
	
	<form action="/adduser" method="post">
	
	<div class="form-group">
	<label>Enter Your First Name</label><input type="text" class="form-control" name="firstname"><br>
	<label>Enter Your Last Name</label><input type="text" class="form-control" name="lastname"><br>
	<label>Enter Your Favorite Climbing Spot</label><input type="text" class="form-control" name="favgym"><br>
	<label>Enter Your Height</label><input type="text" class="form-control" name="height"><br>
	<label>Enter Your Weight</label><input type="text" class="form-control" name="weight"><br>
	<label>Enter Your Age</label><input type="text" class="form-control" name="age"><br>
	<label>Enter A Username</label><input type="text" class="form-control" name="username"><br>
	<label >Enter A Password</label><input type="password" class="form-control" name="password"><br>
	</div>
	
	<button class="btn-primary">Submit</button>
	<br>
	<br>
	
	</form>

	</div>
	<br>


</body>
</html>