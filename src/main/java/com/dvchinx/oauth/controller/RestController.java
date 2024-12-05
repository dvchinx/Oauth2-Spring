package com.dvchinx.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello everyone";
    }

    @GetMapping("/helloSecured")
    public String protectedResource() {
        return "Hello (protected)";
    }
}
