package dev.prathamesh.SpringDIBasics.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NGreetingService")
public class I18NEnglishGreetingService implements I18NGreetingService {

	@Override
	public String sayHello() {
		return "Hello World - EN";
	}

}
