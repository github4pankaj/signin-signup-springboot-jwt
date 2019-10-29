package com.javainuse.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.dao.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

	com.javainuse.model.User save(com.javainuse.model.User user);
}
