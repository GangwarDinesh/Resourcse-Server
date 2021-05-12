package com.service.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.profile.model.User;

@RestController
@RequestMapping("/services")
public class UserController {

	@GetMapping("/profile")
	public User getProfile() {
		User user = new User(101, "Dinesh Gangwar", "dineshgngwr@gmail.com");
		return user;
	}
}
