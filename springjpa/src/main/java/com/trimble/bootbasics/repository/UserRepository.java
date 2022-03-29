package com.trimble.bootbasics.repository;

import com.trimble.bootbasics.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
