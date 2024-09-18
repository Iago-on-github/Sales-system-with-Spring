package com.springbootproject.couse.Repositories;

import com.springbootproject.couse.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
