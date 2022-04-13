package com.estudo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.project.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
