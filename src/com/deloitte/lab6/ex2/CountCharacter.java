package com.deloitte.lab6.ex2;

import java.util.HashMap;

public class CountCharacter {
    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'a', 'a', 'c', 'd', 'e' };
        countChars(chars);
    }

    public static void countChars(char[] ch) {
        HashMap<Character, Integer> values = new HashMap<>();
        for (char c : ch) {
            int count = values.getOrDefault(c, 0);
            values.put(c, count + 1);
        }
        values.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
