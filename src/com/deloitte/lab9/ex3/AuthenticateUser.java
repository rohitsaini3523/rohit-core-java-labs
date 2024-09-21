package com.deloitte.lab9.ex3;

import java.util.function.BiFunction;

public class AuthenticateUser {
    public static void main(String[] args) {
        BiFunction<String, String, Boolean> authenticate = (username, password) -> {
            if (username.equals("rohit") && password.equals("rohit"))
                return true;
            return false;
        };
        System.out.println(authenticate.apply("null", null));
        System.out.println(authenticate.apply("rohit", "rohit"));
    }
}
