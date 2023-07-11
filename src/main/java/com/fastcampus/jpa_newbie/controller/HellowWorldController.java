package com.fastcampus.jpa_newbie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}