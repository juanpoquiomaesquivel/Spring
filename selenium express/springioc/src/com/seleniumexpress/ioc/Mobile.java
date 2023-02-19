package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");

		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}
}

// https://www.youtube.com/watch?v=r2Q0Jzl2qMQ&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=1