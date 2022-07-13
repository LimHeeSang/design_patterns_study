package com.heesang.designpatterns_study._02_structural_patterns._12_proxy._03_java;

import com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._02_interface.DefaultGameService;
import com.heesang.designpatterns_study._02_structural_patterns._12_proxy._02_after._02_interface.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) throws InterruptedException {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() throws InterruptedException {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("O");
                    method.invoke(target, args);
                    System.out.println("ㅁ");
                    return null;
                });
    }
}
