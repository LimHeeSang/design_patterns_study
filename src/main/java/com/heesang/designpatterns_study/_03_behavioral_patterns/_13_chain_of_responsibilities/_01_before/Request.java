package com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

}
