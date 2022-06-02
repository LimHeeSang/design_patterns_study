package com.heesang.designpatterns_study._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student heesang = new Student("heesang");
        Student yuna = new Student("yuna");
        List<Student> students = new ArrayList<>();
        students.add(heesang);
        students.add(yuna);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
