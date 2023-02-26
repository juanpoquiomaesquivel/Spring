package com.seleniumexpress.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
	}
}

// https://www.youtube.com/watch?v=aULu-QRagXI&list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&index=6