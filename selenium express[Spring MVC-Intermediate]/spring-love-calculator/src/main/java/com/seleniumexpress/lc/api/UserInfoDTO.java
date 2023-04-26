package com.seleniumexpress.lc.api;

public class UserInfoDTO {

	private String userName = "Mr x";
	private String crushName = "Miss y";
	
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
