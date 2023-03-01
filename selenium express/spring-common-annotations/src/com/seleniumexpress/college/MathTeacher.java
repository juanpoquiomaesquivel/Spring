package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // it is going to match first (instead of using @Qualifier)
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi I am your math teacher");
		System.out.println("My name is Sourav");
	}
}
