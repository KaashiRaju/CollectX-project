package com.example.collectx.controller;

import com.example.collectx.dto.SignupRequest;
import com.example.collectx.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {

        return authService.signup(request);

    }
}