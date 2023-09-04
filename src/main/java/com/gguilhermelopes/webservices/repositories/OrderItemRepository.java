package com.gguilhermelopes.webservices.repositories;

import com.gguilhermelopes.webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
