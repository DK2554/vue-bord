package com.spring.vuebord.service;


import com.spring.vuebord.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;

    public List<HashMap<String,Object>> getUser(){
        return testMapper.selectTest();
    }
}
