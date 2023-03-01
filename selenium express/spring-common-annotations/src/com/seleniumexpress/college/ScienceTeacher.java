package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi I am your Science teacher");
		System.out.println("My name is Dhoni");
	}
}
