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
<div class="top-nav-bar" style="font-size:1.5em">
<p style="padding: 20px">${welcome} ${sessionUser.firstname}</p>
</div>
<div style="text-align: center">
<h1>BOULDERING ASCENT</h1>
<br><br><br>
<!-- <h3>What date did you climb? (dd/mm/yyyy)</h3>
<br>
<input type="text" name="dateboulder"> -->
<br><br>
<h3>What Level of Difficulty?</h3>
<form action="/addboulder/${sessionUser.user_id}">
<select name="boulderdifficulty">
<option value="V 0">V 0</option>
<option value="V 0+">V 0+</option>
<option value="V 1">V 1</option>
<option value="V 1+">V 1+</option>
<option value="V 2">V 2</option>
<option value="V 2+">V 2+</option>
<option value="V 3">V 3</option>
<option value="V 3+">V 3+</option>
<option value="V 4">V 4</option>
<option value="V 4+">V 4+</option>
<option value="V 5">V 5</option>
<option value="V 5+">V 5+</option>
<option value="V 6">V 6</option>
<option value="V 6+">V 6+</option>
<option value="V 7">V 7</option>
<option value="V 7+">V 7+</option>
<option value="V 8">V 8</option>
<option value="V 8+">V 8+</option>
<option value="V 9">V 9</option>
<option value="V 9+">V 9+</option>
<option value="V 10">V 10</option>
<option value="V 10+">V 10+</option>
<option value="V 11">V 11</option>
<option value="V 11+">V 11+</option>
</select>
<br><br><br>

<h3>How much time did you spend bouldering?</h3>
<select name="bouldertime">
<option value="5 minutes">5 minutes</option>
<option value="10 minutes">10 minutes</option>
<option value="15 minutes">15 minutes</option>
<option value="20 minutes">20 minutes</option>
<option value="25 minutes">25 minutes</option>
<option value="30 minutes">30 minutes</option>
<option value="35 minutes">35 minutes</option>
<option value="40 minutes">40 minutes</option>
<option value="45 minutes">45 minutes</option>
<option value="50 minutes">50 minutes</option>
<option value="50 minutes">55 minutes</option>
<option value="1 hour">1 hour</option>
</select>
<br><br><br>

<h3>How many times did you climb that route?</h3>
<br>
<input type="text" name="numboulder"> 
<br><br>
	<input type="submit"
			value="Submit">  
			

</form>
</div>
</body>
</html>