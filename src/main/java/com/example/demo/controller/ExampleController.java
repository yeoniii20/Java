package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @Operation(
            summary = "이 API는 예제 엔드포인트입니다.",
            description = "이 API는 예제를 위한 간단한 설명입니다.",
            tags = {"예제 API"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공적으로 요청이 처리됨"),
            @ApiResponse(responseCode = "400", description = "잘못된 요청"),
            @ApiResponse(responseCode = "500", description = "서버 오류")
    })
    @GetMapping("/example")
    public String exampleEndpoint() {
        return "Hello, Swagger!";
    }
}
