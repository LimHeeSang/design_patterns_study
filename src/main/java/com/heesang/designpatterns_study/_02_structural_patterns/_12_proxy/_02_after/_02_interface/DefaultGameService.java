package com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._02_interface;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() throws InterruptedException {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
        //게임에 걸리는 시간입니다.
        Thread.sleep(1000L);
    }
}
