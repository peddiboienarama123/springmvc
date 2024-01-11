<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
    		<p>
    			<h1>Error Message</h1> <br>
    			<h3>${exception.getMessage()} </h3> <br>
    			<h3>${exception.getClass().getSimpleName()} </h3>
    		</p>
    	</div>
</body>
</html>