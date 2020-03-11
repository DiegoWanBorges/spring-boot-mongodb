package com.spring.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		//List<User> list= service.findAll();
		User a = new User("1","Maria","maria@gmail.com");
		User b = new User("2","João","joao@gmail.com");
		
		return ResponseEntity.ok().body(Arrays.asList(a,b));
		}
}
