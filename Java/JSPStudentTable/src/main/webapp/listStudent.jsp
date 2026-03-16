<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<body>

<h2>Student List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Course</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("select * from student");

while(rs.next())
{

%>

<tr>

<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("name") %></td>
<td><%= rs.getString("email") %></td>
<td><%= rs.getString("course") %></td>

<td>
<a href="editStudent.jsp?id=<%= rs.getInt("id") %>">Edit</a>
</td>

<td>
<a href="deleteStudent.jsp?id=<%= rs.getInt("id") %>">Delete</a>
</td>

</tr>

<%
}
%>

</table>

<br>
<a href="addStudent.jsp">Add New Student</a>

</body>
</html>