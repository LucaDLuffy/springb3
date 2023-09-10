package com.exemple.springboot.repositores;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
