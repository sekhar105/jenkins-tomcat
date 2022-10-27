package com.sekahr.jenkinstomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JenkinController {

	
	@RequestMapping("/")
	public String welcome() {
		
		return "welcome";
	}
}
