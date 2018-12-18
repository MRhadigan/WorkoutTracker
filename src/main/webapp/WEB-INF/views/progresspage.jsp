<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<div class="top-nav-bar" style="font-size:1.5em">
<p style="padding: 20px">${welcome} ${sessionUser.firstname}</p>
</div>
<br><br><br>
<h1>HERE IS YOUR PROGRESS!</h1>
<br><br>
<h3>Bouldering Progress</h3>
<table border="1">
						<tr>
							<!-- <th></th> -->
							<th>Boulder ID#</th>
							<th>User ID#</th>
							<th>Number of times</th>
							<th>Time spent bouldering</th>
							<th>Boulder difficulty</th>
				
							<th></th>
							<!-- <th></th> -->
						</tr>
	<c:forEach var="boulder" items="${boulderinfo}">
	<tr>
	<td>${boulder.boulderid}</td>
	<td>${sessionUser.user_id}</td>
	<td>${boulder.numboulder}</td>
	<td>${boulder.bouldertime}</td>
	<td>${boulder.boulderdifficulty}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>