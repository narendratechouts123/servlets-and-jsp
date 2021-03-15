package com.techouts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Servlet implementation class Loggers
 */
@WebServlet("/Loggers")
public class Loggers extends HttpServlet {
 
 Logger log1=null;
 @Override

public void init() throws ServletException {
	 
	super.init();
	log1=Logger.getRootLogger();
	BasicConfigurator.configure();
}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		 log1.setLevel(Level.ERROR);
		  log1.error("this is error");
 	  log1.info("this is information");
 	  log1.fatal("this is fata error");

 	  p.print(log1.getName());
	}

}
