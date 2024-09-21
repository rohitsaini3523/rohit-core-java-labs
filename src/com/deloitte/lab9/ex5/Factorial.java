package com.deloitte.lab9.ex5;

import java.util.function.IntUnaryOperator;

public class Factorial {
    public static void main(String[] args) {
        IntUnaryOperator factorialFunc = Factorial::factorial;
        System.out.println(factorialFunc.applyAsInt(5));
    }

    public static int factorial(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        return ans;
    }
}
