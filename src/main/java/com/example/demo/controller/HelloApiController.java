package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloApiController {

    private final HelloService helloService;

    // 생성자 주입 방식으로 HelloService를 주입
    public HelloApiController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        // Service의 메서드를 호출하여 응답 데이터 반환
        return helloService.sayHello();
    }
}

// 터미널에서 실행하는 경우 명령어
//curl http://localhost:8080/api/hello
