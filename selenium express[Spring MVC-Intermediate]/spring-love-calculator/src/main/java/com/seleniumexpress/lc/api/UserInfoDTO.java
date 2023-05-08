package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " * Your Name can't be blank")
	// @Min(value = 3, message = " * Your Name should have at least three characters") // numbers
	@Size(min = 3, max = 15, message = " * Your Name should have char between 3-15")
	private String userName;
	
	@NotBlank(message = " * Your Crush Name can't be blank")
	@Size(min = 3, max = 15, message = " * Your Crush Name should have char between 3-15")
	private String crushName;
	
	@AssertTrue(message = "Fagree to user our app")
	private boolean termAndCondition; 
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	public UserInfoDTO() {
		System.out.println("constructor is called");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
}
