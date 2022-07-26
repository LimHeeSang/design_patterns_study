package com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
