package com.deloitte.lab9.ex2;

import java.util.function.Function;

public class InsertSpace {
    public static void main(String[] args) {
        Function<String, String> insertSpaces = (str) -> {
            String[] temp = str.split("");
            StringBuilder newString = new StringBuilder();
            for (String s : temp) {
                newString.append(s + " ");
            }
            newString.deleteCharAt(newString.length()-1);
            return newString.toString();
        };
        System.out.println(insertSpaces.apply("CG"));
    }
}
