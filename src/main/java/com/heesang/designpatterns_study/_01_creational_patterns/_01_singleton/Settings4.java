package com.heesang.designpatterns_study._01_creational_patterns._01_singleton;

/**
 * static inner 클래스 홀더
 */
public class Settings4 {

    private Settings4() {
    }

    private static class SettingHolder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return SettingHolder.INSTANCE;
    }
}
