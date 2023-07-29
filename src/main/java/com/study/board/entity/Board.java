package com.study.board.entity;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //db에 있는 table을 의미함
@Data //이 어노테이션을 넣으면 컨트롤러에서 .getId() 이렇게 getter로 데이터를 받을 수 있음
public class Board { //class name은 db에 있는 table 이름이랑 일치시켜주는게 좋음

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //이 3개인 db에 있는 table의 Column 요소들
    private String title;
    private String content;

}
