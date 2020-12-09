package com.capgi.service;

import com.capgi.dto.Greeting;
import com.capgi.dto.User;

public interface IGreetingService {
	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);
}
