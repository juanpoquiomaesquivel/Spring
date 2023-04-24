package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {LoveCalculatorAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/mywebsite.com/*"};
		return arr;
	}

}

// https://www.youtube.com/watch?v=lJxUwcmdHro&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=5