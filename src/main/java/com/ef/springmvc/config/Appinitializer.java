package com.ef.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Appinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 return new Class[] {
		            AppContext.class
		        };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {
		            WebMvcConfig.class
		        };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
	            "/"
	        };
	}

}
