package com.jkdev.glassthunk.readerApp.service;

import java.util.List;

import com.jkdev.glassthunk.readerApp.User;

public interface UserService {
	
	List<User> findAllUsers();
	User findByUserName(String userName);
	User save(User user);

}
