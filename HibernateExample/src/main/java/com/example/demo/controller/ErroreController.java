package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ErroreController {
	

	public String rooteception() {
		return "rootexceptionpage";
		
	}

}
