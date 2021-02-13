package com.spring.vuebord.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    //xml에 id값과 메소드 명을 일치하도록 설정해준다.
    List<HashMap<String, Object>> selectTest();


}
