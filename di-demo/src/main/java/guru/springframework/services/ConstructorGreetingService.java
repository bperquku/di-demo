package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}

}
