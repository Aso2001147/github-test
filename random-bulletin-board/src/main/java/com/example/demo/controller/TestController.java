package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("home2")
	public String home2() {
		return "home2";
	}

}
