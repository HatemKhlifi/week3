package org.asb.service;

import java.util.List;

import org.asb.dao.UserDao;
import org.asb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		return userDao.findOne(id);
	}

	@DeleteMapping("/user")
	public void deleteUser(@PathVariable Long id) {
		userDao.delete(id);
	}

}
