package com.heesang.designpatterns_study._03_behavioral_patterns._14_command._02_after;

import com.heesang.designpatterns_study._03_behavioral_patterns._14_command._01_before.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
