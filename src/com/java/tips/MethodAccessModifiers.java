package com.java.tips;


//public, protected, (default), private
//
public class MethodAccessModifiers {
    public static void main(String[] args) {

        // Private methods can not be accessed from a different class and package
        // In a different package default private and protected can not be accessed
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
//        exampleClass.privateMethod();
        exampleClass.defaultMethod();

    }
}
