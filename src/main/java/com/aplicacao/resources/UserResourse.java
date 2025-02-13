package com.aplicacao.resources;

import com.aplicacao.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResourse {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Joao", "email@example.com", "123456789", "senha123");
        return ResponseEntity.ok().body(u);
    }
}
