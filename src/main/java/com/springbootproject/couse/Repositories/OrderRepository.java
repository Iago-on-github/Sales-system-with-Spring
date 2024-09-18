package com.springbootproject.couse.Repositories;

import com.springbootproject.couse.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
