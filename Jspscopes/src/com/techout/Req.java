package com.techout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Req
 */
@WebServlet("/req")
public class Req extends HttpServlet {
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletContext con=getServletContext();
		 PrintWriter pr=response.getWriter();
		pr.print("servlet is called"+request.getAttribute("name"));
	}

 

}
