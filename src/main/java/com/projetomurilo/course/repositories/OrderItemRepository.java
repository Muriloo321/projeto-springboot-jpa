package com.projetomurilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetomurilo.course.entities.OrderItem;
import com.projetomurilo.course.entities.User;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
