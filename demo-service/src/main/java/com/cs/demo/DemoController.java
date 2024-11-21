package com.cs.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/demo")
public class DemoController {
	@GetMapping("/hi")
	public String greetings() {		
		return "Welcome to Publisher";
	}
}
