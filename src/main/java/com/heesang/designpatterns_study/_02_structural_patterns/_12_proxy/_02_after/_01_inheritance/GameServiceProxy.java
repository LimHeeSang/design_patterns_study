package com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._01_inheritance;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("게임 실행 시간 : " + (System.currentTimeMillis() - before));
    }
}
