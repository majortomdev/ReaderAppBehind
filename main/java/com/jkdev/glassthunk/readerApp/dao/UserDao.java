package com.jkdev.glassthunk.readerApp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jkdev.glassthunk.readerApp.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	List<User> findAll();
	
	User findByUserName(String userName);
	
	User findByUserId(Long userId);
	
	@SuppressWarnings("unchecked")
	User save(User user);
	
}
