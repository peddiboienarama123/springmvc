<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


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
			<form:form method="POST" action="/springmvc/standard/stud" modelAttribute="studentref" >
				<table>
        			<tr>
        				<td>Id No</td>
        				<td><form:input type="text" path="id"></form:input>
        				<form:errors path="id" cssStyle="color:red;" /></td>
        			</tr>
        			<tr>
        				<td> Student Name</td>
        				<td><form:input type="text" path="name"></form:input>
        				<form:errors path="name" cssStyle="color:red;" /> </td>
        			</tr>
        			<tr>
        				<td> Student Standard</td>
        				<td><form:input type="text" path="standard"></form:input>
        				<form:errors path="standard" cssStyle="color:red;" /></td> 
        			</tr>
        			<tr>
					<td>Code</td>
					<td><form:input type="text" path="code"></form:input> 
					<form:errors path="code" cssStyle="color:red;" /></td>
				</tr>
				<tr>
					<td>Faculty</td>
					<td> <form:input type="text" path="faculty"></form:input> 
						<form:errors path="faculty" cssStyle="color:red;" /></td>
				</tr>
				
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
		</div> 
</body>
</html>