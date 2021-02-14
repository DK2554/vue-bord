package com.spring.vuebord.bord.controller;


import com.spring.vuebord.bord.domain.BoardVO;
import com.spring.vuebord.bord.service.BoardServiceImpl;
import com.spring.vuebord.bord.service.BordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardListService;

    //게시글 개수 조회 로직
    @GetMapping("/test")
    public String getCount(){
        return String.valueOf(boardListService.getCount());
    }
    @GetMapping("/list")
    public List<BoardVO> getList() {
        return boardListService.boardListService();
    }



}
