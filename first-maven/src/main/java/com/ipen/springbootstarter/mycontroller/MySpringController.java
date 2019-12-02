package com.ipen.springbootstarter.mycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

}
