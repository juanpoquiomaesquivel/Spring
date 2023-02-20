package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student abhi = context.getBean("student", Student.class);
		abhi.displayStudentInfo();
		Student dilip = context.getBean("dilip", Student.class);
		dilip.displayStudentInfo();

		/*Student ashish = context.getBean("ashish", Student.class);
		ashish.displayStudentInfo();*/
	}
}

// https://www.youtube.com/watch?v=vLMaFRgZjM0&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=2
// https://www.youtube.com/watch?v=F0oK42CwCuo&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=3