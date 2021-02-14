package com.spring.vuebord.bord.mapper;

import com.spring.vuebord.bord.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {
     //게시글 개수
     public int boardCount();

     // 게시글 목록
     public List<BoardVO> boardList();

     //게시글 상세
     public BoardVO boardDetail(int bno);

     //게시글 작성
     public int boardWrite(BoardVO boardVO);

     //게시글 수정
     public int boardUpdate(BoardVO boardVO);

     //게시글 삭제
     public int boardDelete(int bno);


}
