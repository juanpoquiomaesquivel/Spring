package com.seleniumexpress.autowired;

public class Heart {

	private String nameOfAnimal;
	private Integer noOfHeart;

	public void pump() {
		System.out.println("your heart is pumping");
		System.out.println("Alive");
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public Integer getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(Integer noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
}
