package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();

		AnotherStudent another = context.getBean("anotherStudent", AnotherStudent.class);
		another.startCheating();
	}
}

// https://www.youtube.com/watch?v=LcmL5ee8XGc&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=4