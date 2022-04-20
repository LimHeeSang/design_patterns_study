package com.heesang.designpatterns_study._01_creational_patterns._01_singleton;

/**
 * 이른 초기화
 */
public class Settings6 {

    private static final Settings6 INSTANCE = new Settings6();

    private Settings6() {
    }

    public static Settings6 getInstance() {
        return INSTANCE;
    }
}
