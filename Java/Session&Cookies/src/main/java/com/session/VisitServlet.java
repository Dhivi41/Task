package com.session;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class VisitServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

int count = 1;

Cookie cookies[] = request.getCookies();

if(cookies != null)
{
for(Cookie c : cookies)
{
if(c.getName().equals("visit"))
{
count = Integer.parseInt(c.getValue()) + 1;
}
}
}

Cookie visitCookie = new Cookie("visit", String.valueOf(count));
response.addCookie(visitCookie);

out.println("<h2>You visited this page " + count + " times</h2>");
out.println("<br><a href='dashboard.html'>Back to Dashboard</a>");

}
}