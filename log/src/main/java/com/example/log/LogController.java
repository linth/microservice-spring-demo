package com.example.log;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @GetMapping("")
    public String auth() {
        return "This is an Log page.";
    }
}
