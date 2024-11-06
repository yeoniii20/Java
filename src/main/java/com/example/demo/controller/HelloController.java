package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

// HTML을 반환하는 일반적인 MVC 컨트롤러
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "index";
    }
}
