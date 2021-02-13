package com.spring.vuebord.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    List<HashMap<String, Object>> selectTest();


}
