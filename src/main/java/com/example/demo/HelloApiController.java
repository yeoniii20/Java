package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//REST API 컨트롤러로, JSON 형식의 데이터를 반환
// 애노테이션 - 클래스가 REST API 컨트롤러임을 나타내며, HTML이 아닌 JSON, XML 등의 데이터를 반환
@RestController
// 기본 URL 경로를 "/api"로 설정하여, 이 컨트롤러의 모든 엔드포인트가 "/api" 경로 하위에 위치
@RequestMapping("/api")
public class HelloApiController {

    // "/api/hello" 경로로 GET 요청이 들어왔을 때 호출되는 메서드
    // 애노테이션 - GET 요청을 "/api/hello" 경로로 매핑
    @GetMapping("/hello")
    // 메서드 - JSON 형식으로 데이터를 반환합니다.
    public Map<String, String> sayHello() {

        // 응답 데이터를 담을 Map 객체를 생성
        Map<String, String> response = new HashMap<>();

        // 응답 데이터에 "message"와 "status"라는 키와 그에 대응하는 값을 추가
        response.put("message", "Hello, World!");  // "message" 키에 "Hello, World!"라는 값 할당
        response.put("status", "success");         // "status" 키에 "success"라는 값 할당

        // Map 객체를 반환
        // Spring Boot는 이 Map을 JSON 형식으로 변환하여 응답으로 반환
        return response;
    }
}


// 터미널에서 실행하는 경우 명령어
//curl http://localhost:8080/api/hello
