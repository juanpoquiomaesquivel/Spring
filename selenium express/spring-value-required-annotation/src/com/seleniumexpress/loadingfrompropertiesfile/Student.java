package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.interestedCourse}")
	private String interestedCourse;

	@Value("${student.hobby}")
	private String hobby;

	// @Value("${student.name}")
	/*
	 * public void setName(String name) { this.name = name;
	 * System.out.println("using the setName method"); }
	 */

	// @Required // It doesn't work -use constructor injection to apply required-
	// @Value("${student.interestedCourse}")
	/*
	 * public void setInterestedCourse(String interestedCourse) {
	 * this.interestedCourse = interestedCourse;
	 * System.out.println("using the setInterestedCourse method"); }
	 */

	// @Required
	// @Value("${student.hobby}")
	/*
	 * public void setHobby(String hobby) { this.hobby = hobby;
	 * System.out.println("using the setHobby method"); }
	 */

	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student interested course " + interestedCourse);
		System.out.println("Student hobby " + hobby);
	}
}
