package com.heesang.designpatterns_study._02_structural_patterns._07_bridge._01_before;

public class PoolParty카이사 implements Champion {

    @Override
    public void move() {
        System.out.println("PoolParty 카이사가 움직인다.");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty 카이사가 스킬 Q를 사용한다.");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty 카이사가 스킬 W를 사용한다.");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty 카이사가 스킬 E를 사용한다.");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty 카이사가 스킬 R를 사용한다.");
    }
}
