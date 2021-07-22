package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	private Environment environment;

	@Autowired
	public UserController(UserService userService, Environment environment) {
		this.userService = userService;
		this.environment = environment;
	}

	@GetMapping
	public ResponseEntity<String> getStatus() {
		return ResponseEntity
				.ok("user-service is up and running on port: " + environment.getProperty("local.server.port"));
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User userEntity) {

		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userEntity));
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> displayAllUsers() {
		return ResponseEntity.ok(userService.displayCustomer());
	}

}
