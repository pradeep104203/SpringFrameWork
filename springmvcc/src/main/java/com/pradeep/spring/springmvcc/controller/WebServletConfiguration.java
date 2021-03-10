package com.pradeep.spring.springmvcc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webcontext= new AnnotationConfigWebApplicationContext();
		webcontext.register(SpringConfig.class);
		
		
		ServletRegistration.Dynamic servlet= servletContext.addServlet("dispatcher",new DispatcherServlet(webcontext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
