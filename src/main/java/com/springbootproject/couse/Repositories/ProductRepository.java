package com.springbootproject.couse.Repositories;

import com.springbootproject.couse.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
