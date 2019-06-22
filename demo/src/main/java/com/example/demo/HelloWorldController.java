package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/demo")

	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/enroll")

	public ModelAndView enrollpage() {
		return new ModelAndView("enroll");
	}

	@RequestMapping("/details")

	public String userDetails(UserDetails userDetails, Model model) {

		model.addAttribute("userDetails", userDetails);
		return "details";
	}
}
