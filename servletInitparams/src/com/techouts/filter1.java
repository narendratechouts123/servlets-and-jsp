package com.techouts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;

/**
 * Servlet Filter implementation class filter1
 */
@WebFilter(urlPatterns = "/servlet1",initParams = {
		@WebInitParam(name="name",value="knr")
		
})
public class filter1 extends HttpServlet implements Filter {

	FilterConfig fc=null;
	public void destroy() {
		System.out.println("new servlet destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	 System.out.println("filter service called");
	 
	  System.out.println("called by"+fc.getInitParameter("name"));
	  
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
 System.out.println("filter called");
 fc=fConfig;
	}

}
