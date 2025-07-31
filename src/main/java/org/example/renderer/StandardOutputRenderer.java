package org.example.renderer;


import org.example.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StandardOutputRenderer implements GreetingRenderer {


	private GreetingProvider greetingProvider;
	
	@Autowired
	public void setGreetingProvider(@Qualifier("hello") GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}


	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
