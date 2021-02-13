package com.spring.vuebord.controller;

import com.spring.vuebord.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/user")
    public List<HashMap<String,Object>> getUser(){
        return testService.getUser();
    }

}
