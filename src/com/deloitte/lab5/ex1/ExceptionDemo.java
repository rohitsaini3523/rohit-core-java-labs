package com.deloitte.lab5.ex1;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        try {
            int age = sc.nextInt();
            if (age <= 15) {
                throw new AgeNotValidException("Age Should be above 15");
            }
        } catch (AgeNotValidException e) {
            System.out.println("Age Not Valid Exception Occured!");
        } finally {
            sc.close();
        }
    }
}
