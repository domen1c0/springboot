package com.estudo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
