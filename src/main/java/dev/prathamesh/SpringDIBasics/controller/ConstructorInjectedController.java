package dev.prathamesh.SpringDIBasics.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.prathamesh.SpringDIBasics.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("englishGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
