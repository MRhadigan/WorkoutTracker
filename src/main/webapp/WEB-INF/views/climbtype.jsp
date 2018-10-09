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


<p style="padding: 20px">${welcome} ${sessionUser.firstname}</p>
<br>
<br>
<div align=center>
<h1>What type of climbing did you do?</h1>
<br>
<br>
<a href="bouldering"><button>BOULDERING</button></a>
<br><br><br>
<a href="toprope"><button>TOP ROPE</button></a>
<br><br><br>
<a href="leadclimb"><button>LEAD CLIMB</button></a>
<br><br><br><br><br><br>
<a href="progresspage"><button>YOUR PROGRESS PAGE!</button></a>
</div>
</body>
</html>