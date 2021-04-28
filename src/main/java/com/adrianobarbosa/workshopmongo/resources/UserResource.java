package com.adrianobarbosa.workshopmongo.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.adrianobarbosa.workshopmongo.domain.User;
import com.adrianobarbosa.workshopmongo.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
// 	@GetMapping #outra forma de anotação que substitui o (@RequestMapping)
// 	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<User>> findAll() {
//      User maria = new User("1", "Maria Brown", "maria@gmail.com");
//      User alex = new User("2", "Alex Green", "alex@gmail.com");
//		List<User> list = new ArrayList<>();
//		list.addAll(Arrays.asList(maria, alex));
//		return ResponseEntity.ok().body(list);
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
	List<User> list =service.findAll();
	return ResponseEntity.ok().body(list);
	
	}

}
