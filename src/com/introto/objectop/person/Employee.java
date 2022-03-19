package com.introto.objectop.person;


// Inherits from person class
public class Employee extends Person{

    // state
    private String title;
    private String employer;
    private String employeeGrade;
    private String salary;

    // creation

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public String getEmployer() {
        return employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", Phone Number='" + getPhoneNumber() + '\'' +
                " ,title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade='" + employeeGrade + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
