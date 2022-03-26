package com.java.tips;

public class ExampleClass {
    public void publicMethod(){}
    protected void protectedMethod(){}
    private void privateMethod(){}
    void defaultMethod(){}


    // All methods can be accessed in the same class
    public static void main(String[] args)  {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
        exampleClass.privateMethod();
        exampleClass.defaultMethod();
    }
}
