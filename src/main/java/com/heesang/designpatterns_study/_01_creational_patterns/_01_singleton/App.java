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

        //싱글톤 패턴 구현을 깨트리는 방법 2(직렬화 & 역직렬화 사용)
        Settings1 settings3 = Settings1.getInstance();
        Settings1 settings4 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings3);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings4 = (Settings1) in.readObject();
        }
        System.out.println(settings3 == settings4);
    }
}
