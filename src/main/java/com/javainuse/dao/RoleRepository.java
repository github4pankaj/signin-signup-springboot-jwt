package com.javainuse.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.dao.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String string);

}
