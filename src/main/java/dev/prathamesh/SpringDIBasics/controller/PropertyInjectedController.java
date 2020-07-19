package dev.prathamesh.SpringDIBasics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.prathamesh.SpringDIBasics.service.GreetingService;

@Controller
public class PropertyInjectedController {
	@Qualifier("englishGreetingService")
	@Autowired
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
