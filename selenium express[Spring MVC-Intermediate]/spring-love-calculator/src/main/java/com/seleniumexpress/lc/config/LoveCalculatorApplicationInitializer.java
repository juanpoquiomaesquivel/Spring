package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer //implements WebApplicationInitializer
{

	
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println();
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		// create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// register dispatcher servlet with the servlet context object
		ServletRegistration.Dynamic myCustomServletDispatcher = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);
		
		myCustomServletDispatcher.setLoadOnStartup(1);
		myCustomServletDispatcher.addMapping("/mywebsite.com/*");
	} 
}
