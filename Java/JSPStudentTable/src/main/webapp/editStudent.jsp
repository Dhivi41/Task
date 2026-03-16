<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="java.sql.*" %>

<%

String id = request.getParameter("id");

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

PreparedStatement ps = con.prepareStatement(
"select * from student where id=?");

ps.setString(1,id);

ResultSet rs = ps.executeQuery();

rs.next();

%>

<!DOCTYPE html>
<html>
<body>

<h2>Edit Student</h2>

<form method="post">

<input type="hidden" name="id" value="<%= rs.getInt("id") %>">

Name:
<input type="text" name="name" value="<%= rs.getString("name") %>"><br><br>

Email:
<input type="text" name="email" value="<%= rs.getString("email") %>"><br><br>

Course:
<input type="text" name="course" value="<%= rs.getString("course") %>"><br><br>

<input type="submit" value="Update">

</form>

<%

String name = request.getParameter("name");

if(name != null)
{

String email = request.getParameter("email");
String course = request.getParameter("course");

PreparedStatement ps2 = con.prepareStatement(
"update student set name=?,email=?,course=? where id=?");

ps2.setString(1,name);
ps2.setString(2,email);
ps2.setString(3,course);
ps2.setString(4,id);

ps2.executeUpdate();

response.sendRedirect("listStudent.jsp");

}

%>

</body>
</html>