package guru.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}

}
