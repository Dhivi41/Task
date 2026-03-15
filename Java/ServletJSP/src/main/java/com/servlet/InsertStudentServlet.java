package com.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class InsertStudentServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
int marks = Integer.parseInt(request.getParameter("marks"));

try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

CallableStatement cs = con.prepareCall("{call insertStudent(?,?,?)}");

cs.setInt(1,id);
cs.setString(2,name);
cs.setInt(3,marks);

cs.execute();

out.println("<h2>Student Inserted Successfully</h2>");

}
catch(Exception e){
out.println(e);
}

}
}