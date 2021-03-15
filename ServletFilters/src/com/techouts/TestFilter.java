package com.techouts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class TestFilter
 */
@WebFilter(servletNames = "TestServlet",initParams = @WebInitParam(name = "name1",value="knr"))
 public class TestFilter implements Filter {

   
	
	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		 System.out.println(fConfig.getInitParameter("name1"));
		 System.out.println("servlettest is called");
	}
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter destroyed");
	}


}
