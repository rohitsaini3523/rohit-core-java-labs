package com.deloitte.lab5.ex2;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the name: ");
            String fullName = sc.next();
            String[] name = fullName.split(" ");
            if (name.length < 2) {
                throw new NameNotValidException("first name or last name cannot be blank");
            }
            if (name[0].isBlank() || name[1].isBlank()) {
                throw new NameNotValidException("first name or last name cannot be blank");
            }
        } catch (NameNotValidException e) {
            System.out.println("Name not valid Exception Occurred!");
        } finally {
            sc.close();
        }
    }
}
