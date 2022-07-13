package com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._02_interface;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
