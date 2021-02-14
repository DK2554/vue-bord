package com.spring.vuebord.bord.service;


import com.spring.vuebord.bord.domain.BoardVO;

import java.util.List;

public interface BordService {

   public int getCount();

   public List<BoardVO> boardListService();

    public BoardVO boardDetailService(int bno);

    public int boardInsertService(BoardVO boardVO);

    public int boardUpdateService(BoardVO boardVO);

    public int boardDeleteService(int bno);


}
