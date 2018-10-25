package com.jkdev.glassthunk.readerApp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
/*created jk 25/10/18*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jkdev.glassthunk.readerApp.User;
import com.jkdev.glassthunk.readerApp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//public String login() {}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public User registerUser(@RequestBody User user){
		return userService.save(user);
	}
	

}
