package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet(urlPatterns ="/servlet1",initParams = { @WebInitParam(name="name",value="narendra servlet"),@WebInitParam(name="age",value="25")})
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  @Override
public void init(ServletConfig config) throws ServletException {
	System.out.println("servlet config called");
	
	super.init(config);
}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig sc=getServletConfig();
		ServletContext cont=getServletContext();
		Enumeration e=cont.getInitParameterNames();
		
		while(e.hasMoreElements()) {
			String s=(String) e.nextElement();
			System.out.println(cont.getInitParameter(s));
		}
	
		PrintWriter out=response.getWriter() ;
		out.print("from servlet"+sc.getInitParameter("name")+"  "+sc.getInitParameter("age"));
		 out.println("from context"+cont.getInitParameter("name"));
	}

 

}
