package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;

public class Java_Date_and_Time {
	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month - 1); // January is numbered to 0 in Calendar
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		return LocalDate.of(year, month, day).getDayOfWeek().name();
		// return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
		// Locale.UK).toUpperCase();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);
		String res = Java_Date_and_Time.findDay(month, day, year);
		System.out.println(res);
		bufferedReader.close();
	}
}
