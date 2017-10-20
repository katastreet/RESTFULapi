package com.publickeyrest.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.publickeyrest.springboot.model.User;
import com.publickeyrest.springboot.respository.UserRepository;

@Controller
@RequestMapping(path="/qr_api")
public class UserController {
	@Autowired
	
	private UserRepository userRepository;
	
	@GetMapping(path = "/user")
	public @ResponseBody String addNewUser(@RequestParam String username, @RequestParam String publicKey) {
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setPublicKey(publicKey);
		
		userRepository.save(newUser);
		return "Saved";
	}
	
	@GetMapping(path = "/getuser")
	public @ResponseBody User showData(@RequestParam(value="username") String username) {
		return userRepository.findByusername(username);
	}
	
}
