package com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 처리");
        super.handle(request);
    }
}
