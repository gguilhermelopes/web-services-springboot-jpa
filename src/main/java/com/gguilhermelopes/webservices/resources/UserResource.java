package com.gguilhermelopes.webservices.resources;

import com.gguilhermelopes.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(
                1L,
                "Guilherme",
                "guilherme@gmail.com",
                "123456789",
                "SenhaForte123"
                );

        return ResponseEntity.ok().body(user);
    }
}
