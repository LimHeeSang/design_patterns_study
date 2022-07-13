package com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._01_inheritance;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
