package com.exemple.springboot.resource;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.User;
import com.exemple.springboot.services.CategoryServices;
import com.exemple.springboot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryServices serivices;
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){//aqui
        List<Category> list = serivices.findaAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = serivices.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
