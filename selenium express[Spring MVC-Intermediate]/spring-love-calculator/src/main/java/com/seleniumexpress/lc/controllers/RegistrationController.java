package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		System.out.println("inside showRegistrationPage() method");
		
		// load the saved user data from the database
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("2233445566");
		
		CommunicationDTO cdto = new CommunicationDTO();
		cdto.setPhone(phone);
		
		dto.setCommunicationDTO(cdto);
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		System.out.println("inside processUserReg() method");
		// save the dto object in to our database
		return "registration-success";
	}
	
}
