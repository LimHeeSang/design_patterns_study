package com.heesang.designpatterns_study._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        game.setBlueTeamScore(30);
        game.setRedTeamScore(30);

        game.setBlueTeamScore(blueTeamScore);
        game.setRedTeamScore(redTeamScore);
    }
}
