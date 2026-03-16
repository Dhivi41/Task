<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%

String id = request.getParameter("id");

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

PreparedStatement ps = con.prepareStatement(
"delete from student where id=?");

ps.setString(1,id);

ps.executeUpdate();

response.sendRedirect("listStudent.jsp");

%>