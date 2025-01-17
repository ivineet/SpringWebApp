package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//to process form data
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
