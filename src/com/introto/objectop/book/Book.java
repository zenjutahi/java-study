package com.introto.objectop.book;

public class Book {
    private String name;
    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void bookName(){
        System.out.println(this.name);
    }
}
