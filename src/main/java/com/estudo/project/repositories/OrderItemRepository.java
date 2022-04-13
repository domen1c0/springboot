package com.estudo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.project.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
