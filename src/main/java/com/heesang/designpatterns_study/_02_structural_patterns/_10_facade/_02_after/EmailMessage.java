package com.heesang.designpatterns_study._02_structural_patterns._10_facade._02_after;

public class EmailMessage {

    private String from;

    private String to;
    private String cc;

    private String subject;

    private String text;

    public EmailMessage(String from, String to, String cc, String subject, String text) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.subject = subject;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }


    public String getSubject() {
        return subject;
    }


    public String getText() {
        return text;
    }


    public String getCc() {
        return cc;
    }

}
