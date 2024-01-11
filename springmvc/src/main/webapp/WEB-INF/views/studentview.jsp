<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import = "com.org.bean.*" %>
 <%@ page import = "java.util.*"%>
    

    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>	
    	
    	<div>
        	<table>
        		<tr>
        			<th>Name</th>
        			<th>Standard</th>
        			<th>Code</th>
        			<th>Faculty</th>
        			
        		</tr>
        		<%-- <c:forEach items="${student}" var="stud" >
        			<c:choose>  
	        			<c:when test = "${stud.name == 'RAJU'}">
			        		<tr style="background-color:green;">
			        			<td>${stud.name}</td>
			        			
			        			<td>${stud.standard}</td>
			        		</tr>
		        		</c:when>
		        		<c:otherwise>  
		        			<tr style="background-color:red;">
			        			<td>${stud.name}</td>
			        			<td>${stud.standard}</td>
			        			
			        		</tr>
		        		</c:otherwise>  
		        	</c:choose>  
        		</c:forEach>
        		 --%>
        		<% 
        			List<Student> standards = (List<Student>)request.getAttribute("standards");
        			for(Student stand : standards){
        			out.println("<tr>");
        			
        				out.println("<td>");
        					out.println(stand.getName());
        				out.println("</td>");
        				out.println("<td>");
    					out.println(stand.getStandard());
    				out.println("</td>");
        				
        				
        				out.println("<td>");
        					out.println(stand.getCode());
        				out.println("</td>");
        				out.println("<td>");
    					out.println(stand.getFaculty());
    				out.println("</td>");
        			out.println("</tr>");
        			}
        		
        		%>
        		
        	</table>
        </div>
    </body>
</html>
