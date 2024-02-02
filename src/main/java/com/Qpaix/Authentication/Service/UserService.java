package com.Qpaix.Authentication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Qpaix.Authentication.Entity.User;
import com.Qpaix.Authentication.Repo.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
	 public User registerUser(User user) {
	      //  String hashedPassword = passwordEncoder.encode(user.getPassword());
	    //    user.setPassword(hashedPassword);
	        return userRepository.save(user);
	    }
}
