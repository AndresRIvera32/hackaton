package com.hackaton.usermanagment.services;

import com.hackaton.usermanagment.daos.UserRepository;
import com.hackaton.usermanagment.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUser(String email){
        return userRepository.findById(email).get();
    }
}
