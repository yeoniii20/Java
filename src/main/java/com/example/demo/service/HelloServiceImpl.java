package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        response.put("status", "success");
        return response;
    }
}
