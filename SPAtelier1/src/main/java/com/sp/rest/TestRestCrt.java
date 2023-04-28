package com.sp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestCrt {
	
	@RequestMapping("/card")
	public String sayHello() {
		return "cards!";
	}

}

