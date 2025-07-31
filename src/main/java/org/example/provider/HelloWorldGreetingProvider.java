package org.example.provider;


import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
