package com.heesang.designpatterns_study._02_structural_patterns._07_bridge._02_after;

import com.heesang.designpatterns_study._02_structural_patterns._07_bridge._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda카이사 = new 카이사(new KDA());
        kda카이사.skillE();
        kda카이사.skillQ();

        Champion poolParty카이사 = new 카이사(new PoolParty());
        poolParty카이사.skillQ();
        poolParty카이사.skillR();
    }
}
