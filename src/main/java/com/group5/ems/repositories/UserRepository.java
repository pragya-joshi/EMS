package com.group5.ems.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group5.ems.models.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}
