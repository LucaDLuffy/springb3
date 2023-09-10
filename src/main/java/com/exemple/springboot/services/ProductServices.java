package com.exemple.springboot.services;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.Product;
import com.exemple.springboot.repositores.CategoryRepository;
import com.exemple.springboot.repositores.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {//aqui usei o @Service para marcar minha dependencia no UserResorce

    @Autowired
    private ProductRepository repository;

    public List<Product> findaAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
