package com.exemple.springboot.repositores;

import com.exemple.springboot.entities.OrderItem;
import com.exemple.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
