package com.springbootproject.couse.Repositories;

import com.springbootproject.couse.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
