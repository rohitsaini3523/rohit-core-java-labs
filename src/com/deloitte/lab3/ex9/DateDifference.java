package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date in this format: YYYY-MM-DD: ");
		String s = sc.next();
		calculateDifference(s);
		sc.close();
	}

	public static void calculateDifference(String s) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate inputDate = LocalDate.parse(s, dateFormatter);
		Period period = Period.between(date, inputDate);
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		System.out.printf("Duration: %d years, %d months, and %d days.%n", years, months, days);

	}

}
