package dev.prathamesh.SpringDIBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dev.prathamesh.SpringDIBasics.controller.ConstructorInjectedController;
import dev.prathamesh.SpringDIBasics.controller.I18NGreetingsController;
import dev.prathamesh.SpringDIBasics.controller.MyController;
import dev.prathamesh.SpringDIBasics.controller.PropertyInjectedController;
import dev.prathamesh.SpringDIBasics.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiBasicsApplication.class, args);
		
		I18NGreetingsController i18nGreetingsController = (I18NGreetingsController) context.getBean("i18NGreetingsController");
		
		System.out.println("i18nGreetingsController sayHello : " + i18nGreetingsController.sayHello());
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		
		System.out.println("PropertyInjectedController SayHello : " + propertyInjectedController.sayHello());
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		
		System.out.println("SetterInjectedController SayHello : " + setterInjectedController.sayHello());
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println("ConstructorInjectedController SayHello : " + constructorInjectedController.sayHello());
		
		MyController myController = (MyController) context.getBean("myController");

		System.out.println("MyController sayHello : " + myController.sayHello());
	}

}
