package com.springbootproject.couse.Services;

import com.springbootproject.couse.Entities.Category;
import com.springbootproject.couse.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> ctg = categoryRepository.findById(id);

        return ctg.get();
    }
}
