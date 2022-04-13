package com.estudo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
