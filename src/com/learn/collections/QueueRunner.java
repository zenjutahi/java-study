package com.learn.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComparator implements Comparator<String>{

    @Override
    // sorts by ascending
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}


public class QueueRunner {


    public  static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zenj","Jeff","Mutahi","Njogu"));

        // Pulls elements in natural order  after adding customized comparator it returns as specified.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
