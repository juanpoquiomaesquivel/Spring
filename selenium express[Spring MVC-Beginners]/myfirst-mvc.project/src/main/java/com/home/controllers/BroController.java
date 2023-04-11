package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {

	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		return "MRFCricketbat";
	}
}

// https://www.youtube.com/watch?v=5_G1jIiK2hI&list=PL3NrzZBjk6m-OSeL3DRMD_ISa0u-9c1l1&index=8