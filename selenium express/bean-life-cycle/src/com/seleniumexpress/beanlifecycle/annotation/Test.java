package com.seleniumexpress.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// StudentDAO studentDao = context.getBean("studentDAO", StudentDAO.class);
		Hello hello = context.getBean("hello", Hello.class);
		hello.sample();
		// System.out.println(studentDao);
		// studentDao.selectAllRows();
		context.close();
		/* context.registerShutdownHook(); // do the same but this method will be called when the main thread ends
		StudentDAO studentDao1 = context.getBean("studentDAO", StudentDAO.class); */
	}
}

// https://www.youtube.com/watch?v=hUYGGqoXEPc&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=9