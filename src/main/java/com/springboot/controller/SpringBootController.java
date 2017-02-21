package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class SpringBootController {
	@RequestMapping
	public String index(){
		return "Hello,Spring Boot";
	}

}

 