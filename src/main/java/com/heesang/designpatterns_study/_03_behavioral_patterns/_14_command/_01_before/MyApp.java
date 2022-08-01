package com.heesang.designpatterns_study._03_behavioral_patterns._14_command._01_before;

public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new Game());

        Button button = new Button(new Light());
        button.press();
        button.press();

        myApp.press();
        myApp.press();
    }
}
