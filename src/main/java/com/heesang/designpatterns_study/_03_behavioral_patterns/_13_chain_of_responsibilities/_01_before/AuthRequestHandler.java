package com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class AuthRequestHandler extends RequestHandler {

    public void handle(Request request) {
        System.out.println("인증 처리");
        super.handle(request);
    }
}
