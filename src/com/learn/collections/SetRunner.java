package com.learn.collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args){
        List<Character> characters = List.of('A','Z','A','B','Z','F');

        // Unique - Set i.e TreeSet, HashSet, LinkedHashSet

        // ordered
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("tree set " + treeSet);

        // order of insertion
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("LinkedHashSet " + linkedHashSet);

        // whatever order
        Set<Character> hashSet = new HashSet<>(characters);
        hashSet.add('L');
        System.out.println("HashSet " + hashSet);
    }
}
