package com.example.fileSystems.Controllers;

import com.example.fileSystems.Repositories.UserRepository;
import com.example.fileSystems.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository UserRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = UserRepository.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }


    @GetMapping("users/{id}")
    public ResponseEntity<Optional<User>> getUserByID(@PathVariable Long id){
        return new ResponseEntity<>(UserRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        UserRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
