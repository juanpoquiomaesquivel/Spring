package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		student.displayStudentInfo();
	}
}

// https://www.youtube.com/watch?v=2DQXA3MVbIQ&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=7