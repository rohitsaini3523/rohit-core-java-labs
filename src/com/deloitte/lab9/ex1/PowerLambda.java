package com.deloitte.lab9.ex1;

import java.util.function.BiFunction;

public class PowerLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> power = (x, y) -> Math.pow(x, y);
        System.out.println(power.apply(10, 2));

    }
}
