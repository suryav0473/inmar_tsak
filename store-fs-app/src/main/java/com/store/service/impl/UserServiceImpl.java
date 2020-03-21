package com.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.store.model.User;
import com.store.repository.UserRepository;
import com.store.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void createUser(User user) {
		try {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setStatus(1);
			userRepository.save(user);
		} catch (Exception x) {
			x.printStackTrace();
		}

	}

	@Override
	public User findByUserUsername(String username, String password) {
		User user = userRepository.findByUsername(username);
		if (passwordEncoder.matches(password, user.getPassword())) {
			System.out.println("user" + user);
			return user;
		}
		return null;
	}
}
