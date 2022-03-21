package com.learn.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args){
        String str = "This is an awesome occasion. This has never happened before.";

        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = str.toCharArray();
        // get character
        for(char character:characters){
            // check if character exists, if not initiate it else add the value
            Integer integer = occurances.get(character);
            if(integer==null){
                occurances.put(character, 1);
            }else {
                occurances.put(character, integer + 1);
            }
        }

        System.out.println(occurances);

        // String Occurances
        Map<String, Integer> StringOccurances = new HashMap<>();
        //
        // get strings
        String[] words = str.split(" ");

        for(String word:words){
            // check if word exists, if not initiate it else add its count
            Integer integer = StringOccurances.get(word);
            if(integer==null){
                StringOccurances.put(word, 1);
            }else {
                StringOccurances.put(word, integer + 1);
            }
        }

        System.out.println(StringOccurances);
    }
}
