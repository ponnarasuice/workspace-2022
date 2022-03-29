package com.trimble.bootbasics.controller;

import com.trimble.bootbasics.UserService.UserService;
import com.trimble.bootbasics.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/users")
  public void createUser(@RequestBody User user) {
    userService.createUser(user);

  }

  @GetMapping("/users")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable String id) {
    return userService.getUserById(Integer.parseInt(id));
  }


}
