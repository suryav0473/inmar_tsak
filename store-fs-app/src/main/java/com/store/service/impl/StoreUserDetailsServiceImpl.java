package com.store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.store.model.User;
import com.store.repository.UserRepository;
@Service
public class StoreUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {

		User user = userRepository.findByUsername(username);

		if (user == null) {
			throw new BadCredentialsException("Invalid Username or Password");
		}
		if (user.isStatus() == 1) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ADMIN"));
			org.springframework.security.core.userdetails.User loginUser = new org.springframework.security.core.userdetails.User(
					user.getUsername(), user.getPassword(), authorities);
			return loginUser;
		}
		throw new InternalAuthenticationServiceException(
				"Access to your account is temporarily disabled.\n Please contact your administrator");
	}

}
