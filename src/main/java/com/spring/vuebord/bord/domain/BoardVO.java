package com.spring.vuebord.bord.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor //매개변수있는 생성자
public class BoardVO {

    private int bno;
    private String title; //제목
    private String content; //내용
    private String writer;//작성자
    private Date rDate;


}
