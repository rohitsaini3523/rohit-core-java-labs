package com.deloitte.lab3.ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReplaceConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.next();
		System.out.println("Mirror image: " + alterString(s));
		sc.close();
	}

	public static String alterString(String s) {
		StringBuilder result = new StringBuilder();
		Set<String> vowels = new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		vowels.add("A");
		vowels.add("E");
		vowels.add("I");
		vowels.add("O");
		vowels.add("U");

		for (char c : s.toCharArray()) {
			if (vowels.contains(String.valueOf(c))) {
				result.append(c);
			} else if (Character.isLetter(c)) {
				result.append(increment(c));
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static char increment(char c) {
		if (c == 'z')
			return 'a';
		if (c == 'Z')
			return 'A';
		return (char) (c + 1);
	}
}
