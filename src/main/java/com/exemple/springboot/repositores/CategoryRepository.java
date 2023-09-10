package com.exemple.springboot.repositores;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
