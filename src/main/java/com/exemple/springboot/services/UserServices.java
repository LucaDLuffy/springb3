package com.exemple.springboot.services;

import com.exemple.springboot.entities.Order;
import com.exemple.springboot.entities.User;
import com.exemple.springboot.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {//aqui usei o @Service para marcar minha dependencia no UserResorce

    @Autowired
    private UserRepository repository;

    public List<User> findaAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
