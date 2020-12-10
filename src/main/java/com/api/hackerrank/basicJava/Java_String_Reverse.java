package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_String_Reverse {

	private final static String YES = "Yes";
	private final static String NO = "No";

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		String reverseInput = new StringBuffer(input).reverse().toString();
		if (reverseInput.equals(input)) {
			System.out.println(YES);
			return;
		}
		System.out.println(NO);
		return;
	}

}
