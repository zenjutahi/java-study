package com.learn.generics;

import java.util.ArrayList;


// adding <T> to the class to enable it to accept a type
public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }

    public  String toString(){
        return list.toString();
    }
}
