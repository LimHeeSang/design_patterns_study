package com.heesang.designpatterns_study._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        //싱글톤 패턴 구현을 깨트리는 방법 1(리플렉션 사용)
        Settings1 settings1 = Settings1.getInstance();

        Constructor<Settings1> declaredConstructor = Settings1.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings1 settings2 = declaredConstructor.newInstance();

        System.out.println(settings1 == settings2);
    }
}
