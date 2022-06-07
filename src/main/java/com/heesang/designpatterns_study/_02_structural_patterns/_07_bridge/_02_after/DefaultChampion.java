package com.heesang.designpatterns_study._02_structural_patterns._07_bridge._02_after;

import com.heesang.designpatterns_study._02_structural_patterns._07_bridge._01_before.Champion;

public abstract class DefaultChampion implements Champion {

    private final String name;
    private final Skin skin;

    public DefaultChampion(String name, Skin skin) {
        this.name = name;
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s가 움직인다.", skin.getName(), name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s가 스킬 Q를 사용한다.", skin.getName(), name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s가 스킬 W를 사용한다.", skin.getName(), name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s가 스킬 E를 사용한다.", skin.getName(), name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s가 스킬 R를 사용한다.", skin.getName(), name);
    }
}
