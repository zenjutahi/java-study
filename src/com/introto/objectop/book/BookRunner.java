package com.introto.objectop.book;

import com.introto.objectop.MotorBike;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();


        cleanCode.setName("Clean Code");
        cleanCode.bookName();
    }
}
