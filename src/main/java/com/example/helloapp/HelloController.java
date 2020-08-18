package com.example.helloapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello from Google Cloud. " +
                "<br><br><center><big>Spring Boot + Github + Docker + Cloud Build + GCR + GKE" +
                "<br><br> Push Code to Github -> Trigger Build -> Maven Test -> Maven Build -> " +
                "Create Docker image -> Push image to GCR -> Deploy image to GKE";
    }
}
