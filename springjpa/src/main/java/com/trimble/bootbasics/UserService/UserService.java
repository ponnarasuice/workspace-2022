package com.trimble.bootbasics.UserService;

import com.trimble.bootbasics.model.User;

import java.util.List;

public interface UserService {

  void createUser(User user);

  List<User> getAllUsers();

  User getUserById(Integer id);
}
