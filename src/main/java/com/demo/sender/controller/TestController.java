package com.demo.sender.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
@RequiredArgsConstructor
public class TestController {

    private final RedisTemplate template;

    @GetMapping("/name")
    public String youname() {
        template.opsForValue().set("demo","hello world");
        System.out.println("Value of key loda: "+template.opsForValue().get("demo"));
        return "my name nguyen";
    }
}
