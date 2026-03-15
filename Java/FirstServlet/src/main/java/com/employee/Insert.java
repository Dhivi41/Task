package com.employee;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;
public class Insert extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

PrintWriter out=response.getWriter();

int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
double salary=Double.parseDouble(request.getParameter("salary"));

try{

	Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

PreparedStatement ps=con.prepareStatement(
"insert into employee values(?,?,?,?)");

ps.setInt(1,id);
ps.setString(2,name);
ps.setString(3,email);
ps.setDouble(4,salary);

int i=ps.executeUpdate();

if(i>0){
out.println("Employee Inserted Successfully");
}

}catch(Exception e){
out.println(e);
}

}
}