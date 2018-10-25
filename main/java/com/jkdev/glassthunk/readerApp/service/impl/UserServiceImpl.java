package com.jkdev.glassthunk.readerApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkdev.glassthunk.readerApp.User;
import com.jkdev.glassthunk.readerApp.dao.UserDao;
import com.jkdev.glassthunk.readerApp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAllUsers() {
		 
		return userDao.findAll();
	}

	@Override
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public User save(User user) {
		return userDao.save(user);
	}

}
