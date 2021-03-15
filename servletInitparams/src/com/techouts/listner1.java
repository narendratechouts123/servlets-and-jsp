package com.techouts;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class listner1
 *
 */
@WebListener("mylistner")
public class listner1 implements ServletRequestListener,ServletContextListener {

  
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    System.out.println("listener is failed ");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
        System.out.println("listner is called");
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		 ServletContext sc=sce.getServletContext();
		 sc .setInitParameter ("tn", "chennai");
		
	}
	
}
