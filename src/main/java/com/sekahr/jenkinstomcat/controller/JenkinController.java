package com.sekahr.jenkinstomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class JenkinController {

	
	@RequestMapping("/")
	public String welcome() {
		
		return "welcome";
	}
}
