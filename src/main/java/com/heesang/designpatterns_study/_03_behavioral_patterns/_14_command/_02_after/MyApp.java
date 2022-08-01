package com.heesang.designpatterns_study._03_behavioral_patterns._14_command._02_after;

import com.heesang.designpatterns_study._03_behavioral_patterns._14_command._01_before.Game;

public class MyApp {

    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Game game = new Game();

        MyApp myApp = new MyApp(new GameStartCommand(game));
        myApp.press();

        myApp = new MyApp(new GameEndCommand(game));
        myApp.press();
    }
}
