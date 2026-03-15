package com.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class DisplayStudentServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

CallableStatement cs = con.prepareCall("{call displayStudents()}");

ResultSet rs = cs.executeQuery();

out.println("<table border='1'>");
out.println("<tr><th>ID</th><th>Name</th><th>Marks</th></tr>");

while(rs.next())
{

out.println("<tr>");
out.println("<td>"+rs.getInt(1)+"</td>");
out.println("<td>"+rs.getString(2)+"</td>");
out.println("<td>"+rs.getInt(3)+"</td>");
out.println("</tr>");

}

out.println("</table>");

}
catch(Exception e){
out.println(e);
}

}
}