package com.exemple.springboot.resource;

import com.exemple.springboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l, "Maria", "maria@gmail", "9122191","12345");
        return ResponseEntity.ok().body(u);
    }
}
