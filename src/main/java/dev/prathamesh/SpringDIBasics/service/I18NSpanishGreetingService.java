package dev.prathamesh.SpringDIBasics.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18NGreetingService")
public class I18NSpanishGreetingService implements I18NGreetingService {

	@Override
	public String sayHello() {
		return "Hola Mundo - ES";
	}

}
