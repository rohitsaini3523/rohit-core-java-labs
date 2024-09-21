package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String input = sc.nextLine();
		counter(input);
		sc.close();
	}

	public static void counter(String input) {
		int characterLength = input.length();
		// int lines = findLines(input);
		int words = input.split(" ").length;
		System.out.println("characters: " + characterLength + "\nlines: " + "lines" + "\nwords: " + words);
	}
	
	

}
