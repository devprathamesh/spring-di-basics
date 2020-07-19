package dev.prathamesh.SpringDIBasics.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.prathamesh.SpringDIBasics.service.I18NGreetingService;

@Controller
public class I18NGreetingsController {

	private I18NGreetingService i18nGreetingService;
	
	public I18NGreetingsController(@Qualifier("i18NGreetingService") I18NGreetingService i18nGreetingService) {
		this.i18nGreetingService = i18nGreetingService;
	}
	
	public String sayHello() {
		return i18nGreetingService.sayHello();
	}
} 
