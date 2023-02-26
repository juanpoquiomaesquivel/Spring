package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("octopusHeart") // same concept with the setter, note: there is no need
	// to create setter methods if we put the annotations before the dependency
	// Spring will not call these methods
	// -it is like- private Heart heart = new Heart()
	private Heart heart;

	public Human() {

	}

	// @Autowired // by constructor
	public Human(Heart heart) {
		this.heart = heart;
	}

	// @Autowired // default: by type, if it fails then by name (if there were two
	// beans defined from the
	// same class and if they had different names than what is defined in this
	// class then it will fail)
	// We need to add @Qualifier()
	// @Autowired
	// @Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is : " + heart.getNameOfAnimal() + " no of heart present : "
					+ heart.getNoOfHeart());
		} else {
			System.out.println("you are dead");
		}
	}
}
