package com.spring.vuebord.service;


import com.spring.vuebord.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TestServiceImpl implements TestService{

    private final TestMapper testMapper;

    @Override
    public List<HashMap<String,Object>> getUser(){
        return testMapper.selectTest();
    }
}
