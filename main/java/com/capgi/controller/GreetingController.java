package com.capgi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgi.dto.Greeting;
import com.capgi.dto.User;
import com.capgi.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private IGreetingService greetingService;

	@GetMapping("")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		User user = new User();
		user.setfName(name);
		user.setlName("Bhawsar");
		return greetingService.addGreeting(user);
	}
}
