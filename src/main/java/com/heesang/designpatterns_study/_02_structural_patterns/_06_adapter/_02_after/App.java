package com.heesang.designpatterns_study._02_structural_patterns._06_adapter._02_after;

import com.heesang.designpatterns_study._02_structural_patterns._06_adapter._01_before.AccountService;
import com.heesang.designpatterns_study._02_structural_patterns._06_adapter._01_before.security.LoginHandler;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("heesang", "heesang");
        System.out.println(login);
    }
}
