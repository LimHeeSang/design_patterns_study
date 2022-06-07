package com.heesang.designpatterns_study._02_structural_patterns._07_bridge._01_before;

import com.heesang.designpatterns_study._02_structural_patterns._07_bridge._02_after.KDA;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillE();
    }
}
