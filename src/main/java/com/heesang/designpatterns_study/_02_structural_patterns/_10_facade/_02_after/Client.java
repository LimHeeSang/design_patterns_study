package com.heesang.designpatterns_study._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage("keesun", "whiteship", "일남", "오징어게임", "밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
