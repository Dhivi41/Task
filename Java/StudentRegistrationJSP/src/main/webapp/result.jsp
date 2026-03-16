<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String course = request.getParameter("course");

int marks = Integer.parseInt(request.getParameter("marks"));

if(marks < 0 || marks > 100)
{
response.sendRedirect("register.jsp?error=1");
return;
}
%>
<!DOCTYPE html>
<html>
<head>
<title>Student Result</title>
</head>

<body>

<h2>Student Details</h2>

Name: <%= name %> <br><br>

Email: <%= email %> <br><br>

Course: <%= course %> <br><br>

Marks: <%= marks %> <br><br>

</body>
</html>