package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// using 5.3.9 spring framework
public class Client {

	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("noexiste.xml");
		 * System.out.println("beans.xml file loaded"); College college =
		 * context.getBean("collegeBean", College.class);
		 * System.out.println("The college object created by spring is : " + college);
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		System.out.println("The college object created by spring is : " + college);
		college.test();
		((AnnotationConfigApplicationContext) context).close();
	}
}

// https://www.youtube.com/watch?v=x_-Tx6OFYLg&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=8