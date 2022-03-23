package com.execption.handling;

public class ExceptionHandlerRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Print me");
    }

    private static void method1() {
        String str = null;
        str.length();
    }
}
