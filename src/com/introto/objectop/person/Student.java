package com.introto.objectop.person;

// Inherits from person
public class Student extends Person{
    private String collageName;
    private String year;

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCollageName() {
        return collageName;
    }

    public String getYear() {
        return year;
    }
}
