package dev.prathamesh.SpringDIBasics.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String sayHello() {
		return "Hello World!";
	}

}
