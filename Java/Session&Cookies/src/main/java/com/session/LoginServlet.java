package com.session;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String username = request.getParameter("username");
String password = request.getParameter("password");

try {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

PreparedStatement ps = con.prepareStatement(
"select * from users where username=? and password=?");

ps.setString(1, username);
ps.setString(2, password);

ResultSet rs = ps.executeQuery();

if(rs.next())
{

HttpSession session = request.getSession();
session.setAttribute("user", username);

response.sendRedirect("dashboard.html");

}
else
{

response.sendRedirect("login.html");

}

}
catch(Exception e)
{
e.printStackTrace();
}

}
}