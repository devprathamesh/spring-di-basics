package dev.prathamesh.SpringDIBasics.service;

import org.springframework.stereotype.Controller;

@Controller
public class EnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Say Hello from EnglishGreetingService";
	}

}
