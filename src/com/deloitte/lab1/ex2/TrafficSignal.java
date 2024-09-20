package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\nTraffic Signal\n1. Red\n2. Yellow\n3. Green\n4. Exit\nEnter Choice:");
			String input = sc.next();
			switch (input) {
			case "1":
				System.out.println("Stop");
				break;
			case "2":
				System.out.println("Ready");
				break;
			case "3":
				System.out.println("Go");
				break;
			case "4":
				System.out.println("Exit");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

}
