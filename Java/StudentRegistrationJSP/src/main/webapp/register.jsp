<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
</head>

<body>

<h2>Student Registration</h2>

<form action="result.jsp" method="post">

Name:
<input type="text" name="name" required><br><br>

Email:
<input type="email" name="email" required><br><br>

Course:
<input type="text" name="course" required><br><br>

Marks:
<input type="number" name="marks" required><br><br>

<input type="submit" value="Submit">

</form>

<%
String error = request.getParameter("error");

if(error != null){
%>

<p style="color:red;">Marks must be between 0 and 100</p>

<%
}
%>

</body>
</html>