package com.matheus.workshopmongo.resources;

import com.matheus.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Silva", "maria@email.com");
        User alex = new User("2", "Alex", "Alex@email.com");

        List<User> list = new ArrayList<>(Arrays.asList(maria, alex));

        return ResponseEntity.ok(list);
    }
}
