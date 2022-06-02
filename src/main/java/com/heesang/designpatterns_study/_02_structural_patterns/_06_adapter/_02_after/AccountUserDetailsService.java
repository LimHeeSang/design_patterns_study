package com.heesang.designpatterns_study._02_structural_patterns._06_adapter._02_after;

import com.heesang.designpatterns_study._02_structural_patterns._06_adapter._01_before.AccountService;
import com.heesang.designpatterns_study._02_structural_patterns._06_adapter._01_before.security.UserDetails;
import com.heesang.designpatterns_study._02_structural_patterns._06_adapter._01_before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        //정상 로직은 레포지토리에서 Account 엔티티를 가져와야 하지만 예제 이므로 임의 생성
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
