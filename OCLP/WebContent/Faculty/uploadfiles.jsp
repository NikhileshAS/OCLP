<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><p align="center"> UPLOAD YOUR <%=request.getParameter("userId") %> FILES HERE!!!!!</p></h1>
<%
    session.setAttribute("user", request.getParameter("userId"));
 %>
 <% 
 ServletContext context=getServletContext();  
context.setAttribute("user", request.getParameter("userId"));  
%>
<form  action="BookServlet" align="center" enctype="multipart/form-data">
 
	<input type="file" name="fileupload" value="fileupload" id="fileupload">
 		
 		<input type="submit" value="submit" >
 </form>
</body>
</html>