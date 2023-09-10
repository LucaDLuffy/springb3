package com.exemple.springboot.resource;

import com.exemple.springboot.entities.Category;
import com.exemple.springboot.entities.Product;
import com.exemple.springboot.services.CategoryServices;
import com.exemple.springboot.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductServices serivices;
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){//aqui
        List<Product> list = serivices.findaAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = serivices.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
