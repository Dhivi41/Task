package com.employee;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class Display extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Employee Records</title>");
        out.println("</head>");
        out.println("<body style='font-family:Arial;'>");

        out.println("<h2 style='text-align:center;'>Employee Records</h2>");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company", "root", "root");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");

            out.println("<table border='1' align='center' cellpadding='10' cellspacing='0'>");

            out.println("<tr style='background-color:#f2f2f2;'>");
            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Email</th>");
            out.println("<th>Salary</th>");
            out.println("</tr>");

            while (rs.next()) {

                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getDouble("salary") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");

            con.close();

        } catch (Exception e) {
            out.println("<h3>Error : " + e.getMessage() + "</h3>");
        }

        out.println("<br><center><a href='index.html'>Back to Home</a></center>");

        out.println("</body>");
        out.println("</html>");
    }
}