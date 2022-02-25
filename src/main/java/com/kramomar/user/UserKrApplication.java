package com.kramomar.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kramomar.user.entity.User;
import com.kramomar.user.repository.UserDao;

import lombok.RequiredArgsConstructor;


@SpringBootApplication
@RestController
@RequestMapping("/user")
public class UserKrApplication {

	@Autowired
	private UserDao dao;
	public User save(@RequestBody User user) {
		return dao.save(user);
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return dao.findAllUsers();
	}
	@GetMapping("/{id}")
	public User findUser(@PathVariable int id) {
		return dao.findUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return dao.deleteUser(id);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserKrApplication.class, args);
	}

}
