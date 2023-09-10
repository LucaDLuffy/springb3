package com.exemple.springboot.services;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.User;
import com.exemple.springboot.repositores.CategoryRepository;
import com.exemple.springboot.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {//aqui usei o @Service para marcar minha dependencia no UserResorce

    @Autowired
    private CategoryRepository repository;

    public List<Category> findaAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
