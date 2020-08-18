package com.example.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello from Google Cloud";
    }
}
