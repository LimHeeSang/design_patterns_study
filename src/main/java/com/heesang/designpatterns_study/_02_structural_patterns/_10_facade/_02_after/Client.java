package com.heesang.designpatterns_study._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings("127.0.0.1");

        EmailSender javaEmailSender = new JavaEmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage("heesang", "pobi", "일남", "오징어게임", "밖은 더 지옥이더라고..");

        javaEmailSender.sendEmail(emailMessage);
    }
}
