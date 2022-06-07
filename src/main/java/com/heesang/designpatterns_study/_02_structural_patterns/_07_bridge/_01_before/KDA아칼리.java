package com.heesang.designpatterns_study._02_structural_patterns._07_bridge._01_before;

public class KDA아칼리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 아칼리가 움직인다.");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아칼리가 스킬 Q를 사용한다.");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아칼리가 스킬 W를 사용한다.");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아칼리가 스킬 E를 사용한다.");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아칼리가 스킬 R를 사용한다.");
    }
}
