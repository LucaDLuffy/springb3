package com.exemple.springboot.resource;

import com.exemple.springboot.entities.User;
import com.exemple.springboot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices serivices;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){//aqui
        List<User> list = serivices.findaAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = serivices.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
