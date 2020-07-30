package com.nem.docms.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nem.docms.entities.User;
import com.nem.docms.repositories.UserRepository;
//spring.data.mongodb.port=27017
//spring.data.mongodb.host=localhost
//server.port = 8090

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.insert(user);
	}

	public User update(User user) {
		System.out.println("User update Service");
		user.setPassword(user.getPassword());
		user.setValid(true);
//		System.out.println(user);
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(user.getUsername());
		System.out.println(user.isValid());
		return userRepository.save(user);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
}