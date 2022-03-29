package com.trimble.bootbasics.UserService.impl;

import com.trimble.bootbasics.UserService.UserService;
import com.trimble.bootbasics.model.User;
import com.trimble.bootbasics.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public void createUser(User user) {
    userRepository.save(user);
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserById(Integer id) {
    return userRepository.getById(id);
  }
}
