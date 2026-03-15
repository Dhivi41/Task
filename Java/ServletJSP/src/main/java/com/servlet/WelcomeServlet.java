package com.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {

            String user = (String) session.getAttribute("user");

            out.println("<h2>Welcome " + user + "</h2>");
            out.println("<br><a href='student.html'>Insert Student</a><br><br>");
            out.println("<br><a href='login.html'>Logout</a>");
           

        } else {

            out.println("<h3>Session Expired</h3>");
            out.println("<a href='login.html'>Login Again</a>");
        }
    }
}