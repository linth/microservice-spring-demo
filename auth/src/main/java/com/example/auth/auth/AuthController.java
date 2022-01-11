package com.example.auth.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("")
    public String auth() {
        return "This is an Auth page.";
    }
}
