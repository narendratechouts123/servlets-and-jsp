package com.techout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContextScopes
 */
@WebServlet("/cont")
public class ContextScopes extends HttpServlet {
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pr=response.getWriter();
		 
			pr.println("servlet is called"+getServletContext().getServletContextName());
			HttpSession ht=request.getSession();
			pr.print("session is got"+ht.getAttribute("name"));
	}

}
