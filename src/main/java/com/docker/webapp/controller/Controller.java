package com.docker.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping
	public String message(){
			return "Hello! from Docker";
	}
	
}
