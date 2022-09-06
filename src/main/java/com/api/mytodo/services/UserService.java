package com.api.mytodo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mytodo.models.User;
import com.api.mytodo.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;
  
  public User save(User user) {
    return userRepository.save(user);
  }
  public User findByEmail(String email) {
    return userRepository.findByEmail(email);
  }
}
