package com.example.loginsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginsecurity.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByName(String username);
}
