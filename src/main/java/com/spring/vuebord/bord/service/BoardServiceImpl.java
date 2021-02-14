package com.spring.vuebord.bord.service;


import com.spring.vuebord.bord.domain.BoardVO;
import com.spring.vuebord.bord.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements  BordService {

    private final BoardMapper boardMapper;

    @Override
    public int getCount() {
        return boardMapper.boardCount();
    }

    @Override
    public List<BoardVO> boardListService() {
        return boardMapper.boardList();
    }

    @Override
    public BoardVO boardDetailService(int bno) {
        return boardMapper.boardDetail(bno);
    }

    @Override
    public int boardInsertService(BoardVO boardVO) {
        return boardMapper.boardWrite(boardVO);
    }

    @Override
    public int boardUpdateService(BoardVO boardVO) {
        return boardMapper.boardUpdate(boardVO);
    }

    @Override
    public int boardDeleteService(int bno) {
        return boardMapper.boardDelete(bno);
    }
}
