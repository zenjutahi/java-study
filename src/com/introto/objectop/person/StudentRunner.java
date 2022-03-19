package com.introto.objectop.person;

// Inheritance insinuates there is a relationship.

public class StudentRunner {
    public static void main(String[] args) {


        /*
        Student student = new Student();
        student.setName("Zenjy");
        student.setEmail("zenjy@mail.com");
         */

        Employee employee = new Employee();
        employee.setName("Jeff");
        employee.setEmail("zenjy@mail.com");
        employee.setTitle("Developer");
        employee.setPhoneNumber("097125522");
        employee.setEmployer("Trif Company");

        System.out.println(employee);
    }
}
