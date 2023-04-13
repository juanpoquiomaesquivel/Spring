package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	// Return the welcome-page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		// handle the data received from the user
		String userEnteredValue = request.getParameter("foodType");
		
		// adding the captured value to the model
		model.addAttribute("userInput", userEnteredValue);
		
		// set the user data with the model object and send it to view
		
		return "process-order";
	}
}

// https://www.youtube.com/watch?v=Y26LegLMvpw&list=PL3NrzZBjk6m-OSeL3DRMD_ISa0u-9c1l1&index=9