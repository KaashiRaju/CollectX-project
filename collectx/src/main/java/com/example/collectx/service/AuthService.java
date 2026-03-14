package com.example.collectx.service;

import com.example.collectx.dto.SignupRequest;
import com.example.collectx.entity.User;
import com.example.collectx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String signup(SignupRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "User already exists";
        }

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        user.setRoles("AGENT");     // server decides role
        user.setStatus("ACTIVE");  // server decides status

        userRepository.save(user);

        return "User registered successfully";
    }
}