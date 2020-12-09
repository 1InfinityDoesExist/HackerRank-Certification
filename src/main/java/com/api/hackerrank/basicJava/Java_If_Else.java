package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_If_Else {

	private final static String WEIRD = "Weird";
	private final static String NOT_WEIRD = "Not Weird";

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int data = Integer.valueOf(bufferedReader.readLine());
		if (data % 2 != 0) {
			System.out.println(WEIRD);
		} else {
			if (data >= 2 && data <= 5) {
				System.out.println(NOT_WEIRD);
			} else if (data >= 8 && data <= 20) {
				System.out.println(WEIRD);
			} else {
				System.out.println(NOT_WEIRD);
			}
		}
	}
}
