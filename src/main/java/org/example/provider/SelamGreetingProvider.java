package org.example.provider;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
