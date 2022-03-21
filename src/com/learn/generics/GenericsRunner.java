package com.learn.generics;

public class GenericsRunner {
    public static void main(String[] args){
        MyCustomList<String> list = new MyCustomList();

        list.addElement("This1");
        list.addElement("This2");

        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList();

        list2.addElement(Integer.valueOf(7));
        list2.addElement(Integer.valueOf(8));

        System.out.println(list2);

    }
}
