package com.deloitte.lab6.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberSquares {
    public static void main(String[] args) {
        int[] nums = { 12, 1, 30, 4, 5, 13 };
        HashMap<Integer, Integer> squares = getSquares(nums);
        System.out.println("num\t: square ");
        squares.forEach((num, sqaure) -> {
            System.out.println(num + "\t:  " + sqaure);
        });

    }

    public static HashMap<Integer, Integer> getSquares(int[] arr) {
        HashMap<Integer, Integer> squares = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i : arr) {
            numbers.add(i);
        }
        numbers.forEach(num -> {
            squares.put(num, num * num);
        });
        return squares;
    }
}
