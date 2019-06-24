package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErroreController {
	
	@ExceptionHandler(Exception.class)
	public String rooteception() {
		return "rootexceptionpage";
		
	}

}
