package com.store.service;

import com.store.model.User;

public interface UserService {

	public void createUser(User user);

	public User findByUserUsername(String username, String password);

}
