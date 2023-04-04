package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Ok..Here is your sugar.";
	}
}

// https://www.youtube.com/watch?v=Gqcr6g53Mz0&list=PL3NrzZBjk6m-OSeL3DRMD_ISa0u-9c1l1&index=6