package com.kramomar.user.repository;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.kramomar.user.entity.User;

@Repository
public class UserDao {

	
	public static final String HASH_KEY = "User";
	private RedisTemplate template;
	
	
	public User save(User user) {
    template.opsForHash().put(HASH_KEY, user.getId(), user);
	return user;
	}
	
	
	public List<User> findAllUsers(){
		return template.opsForHash().values(HASH_KEY);
	}
}
