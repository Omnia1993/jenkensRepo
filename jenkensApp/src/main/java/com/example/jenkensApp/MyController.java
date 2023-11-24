package com.example.jenkensApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/hello")
	public String hello() {
		return " Hello World ismail Saeed from Home";
	}
	
}
