package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args){
        List<Student> students = List.of( new Student(12, "Kathy"),
                            new Student(15, "John"),
                            new Student(17, "Kama"));

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println(studentsAl);
    }
}
