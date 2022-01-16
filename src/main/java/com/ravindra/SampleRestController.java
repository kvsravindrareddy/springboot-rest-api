package com.ravindra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	@GetMapping("/test")
	public String hello()
	{
		return "Hello Spring Boot";
	}

}