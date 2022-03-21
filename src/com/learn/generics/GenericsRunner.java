package com.learn.generics;

public class GenericsRunner {
    public static void main(String[] args){
        MyCustomList<String> list = new MyCustomList();

        list.addElement("This1");
        list.addElement("This2");
        String value = list.get(0);

        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList();

        list2.addElement(Integer.valueOf(7));
        list2.addElement(Integer.valueOf(8));
        Integer number = list2.get(0);

        System.out.println(number);

    }
}
