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
<body>
<div style="text-align: center">

<form action="validateuser" method="post">

<div class="form-group">
<h1 style="text-align: center">Login</h1>
<br>
<label>USER NAME</label>
<input type="text" class="form-control" name="username" placeholder="UserName">
<br>
<label>PASSWORD</label> 
<input type="password" class="form-control" name="password" placeholder="Password">
<br> 

</div>
<button class="btn-primary">Login</button>

</form>
</div>
</body>
</html>