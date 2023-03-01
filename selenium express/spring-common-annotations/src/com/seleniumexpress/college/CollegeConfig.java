package com.seleniumexpress.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.college") // there's no need to use it if we're not using @Component
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
/*
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	// @Bean(name = {"colBean", "collegeBeanAnother"})
	// @Bean(name = "collegueBean")
	@Bean // another way to create a bean
	public College collegeBean() { // method's name == bean id
		// College college = new College(principalBean());
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
*/
}
