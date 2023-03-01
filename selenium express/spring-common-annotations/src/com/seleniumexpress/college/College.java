package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component("collegeBean") // it does the same thing as .xml file to create a bean
@Component // dafault name: college (class name starts with a lower case)
public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	
	// doesn't work anymore
	@Required // use constructor injection in order to have required fields
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Autowired
	private Principal principal;
	
	@Autowired
	// @Qualifier("scienceTeacher")
	private Teacher teacher;
	
	/* @Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	} */
	
	/* @Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	} */

	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college Name is : " + collegeName);
		System.out.println("testing this methods");
	}
}
