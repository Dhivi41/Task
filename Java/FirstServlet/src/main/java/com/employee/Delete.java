package com.employee;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class Delete extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException,IOException{

PrintWriter out=response.getWriter();

int id=Integer.parseInt(request.getParameter("id"));

try{

	Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/company","root","root");

PreparedStatement ps=con.prepareStatement(
"delete from employee where id=?");

ps.setInt(1,id);

int i=ps.executeUpdate();

if(i>0){
out.println("Employee Deleted Successfully");
}else{
out.println("Employee Not Found");
}

}catch(Exception e){
out.println(e);
}

}
}