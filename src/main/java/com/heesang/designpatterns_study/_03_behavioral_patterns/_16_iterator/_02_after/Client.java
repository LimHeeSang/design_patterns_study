package com.heesang.designpatterns_study._03_behavioral_patterns._16_iterator._02_after;


import com.heesang.designpatterns_study._03_behavioral_patterns._16_iterator._01_before.Post;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("우아한 테크코스 5기");
        board.addPost("우아한 테크코스 5기에 오신 여러분 환영합니다.");
        board.addPost("10개월동안 열심히 하기시 바랍니다.");

        //가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

}
