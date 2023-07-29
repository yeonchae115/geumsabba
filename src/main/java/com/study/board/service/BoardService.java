package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board){ //글 작성

        boardRepository.save(board);
    }

    public Page<Board> boardList(Pageable pageable){ //게시글 리스트 처리

        return boardRepository.findAll(pageable);
    }

    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable){

        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }

    public Board boardView(Integer id){  //특정 게시글 불러오기

        return boardRepository.findById(id).get();
    }

    public void boardDelete(Integer id){

        boardRepository.deleteById(id);
    }
}
