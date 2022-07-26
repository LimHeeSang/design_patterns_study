package com.heesang.designpatterns_study._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("안녕하세요~~!");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handle(request);
    }
}
