package dev.prathamesh.SpringDIBasics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.prathamesh.SpringDIBasics.service.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	@Qualifier("englishGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
