package com.heesang.designpatterns_study._02_structural_patterns._10_facade._02_after;

public class EmailSettings {

    private String host;

    public EmailSettings(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
