package com.hackaton.usermanagment.controllers;

import com.hackaton.usermanagment.entities.User;
import com.hackaton.usermanagment.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserManagmentRest {

    @Autowired
    public UserService userService;

    @GetMapping("/user/{email}")
    public ResponseEntity<User> getUser(@PathVariable String email){
        return new ResponseEntity<>(userService.getUser(email), HttpStatus.OK);
    }
}
