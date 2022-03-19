package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentRunner {
    public static void main(String[] args){
        List<Student> students = List.of( new Student(12, "Kathy"),
                            new Student(15, "John"),
                            new Student(17, "Kama"));

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);

        // descending
        Collections.sort(studentsAl);
        System.out.println(studentsAl);

        //ascending
        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println("From collection sort " + studentsAl);
        // A list also has a .sort() that accepts a comparator
        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("From ArrayList sort " + studentsAl);
    }
}
