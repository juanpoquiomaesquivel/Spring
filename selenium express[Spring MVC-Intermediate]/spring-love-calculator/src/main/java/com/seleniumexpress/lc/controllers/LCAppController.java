package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	/*public String showResultPage(@RequestParam("userName") String userName1,
			@RequestParam("crushName") String crushName1, Model model) {*/
	//public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
	public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		return "result-page";
	}
}

// https://www.youtube.com/watch?v=3x4RoGGpETM&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=6&pp=iAQB