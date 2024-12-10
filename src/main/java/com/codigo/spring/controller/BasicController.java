package com.codigo.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BasicController {
    
    @GetMapping("/hello")
    public String helloFromServer() {
        return "Hola a todos desde mi servidor";
    }
    
    @GetMapping("/bye")
    public String byeFromServer() {
        return "Adios desde mi servidor";
    }
}
