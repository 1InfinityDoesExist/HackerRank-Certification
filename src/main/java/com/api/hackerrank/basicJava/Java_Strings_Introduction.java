package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.util.StringUtils;

public class Java_Strings_Introduction {
	private final static String YES = "Yes";
	private final static String NO = "No";

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input1 = bufferedReader.readLine();
		String input2 = bufferedReader.readLine();
		int len = input1.trim().length() + input2.trim().length();
		System.out.println(len);
		List<String> buffer = Arrays.asList(new String[] { input1, input2 });
		Collections.sort(buffer);
		if (input1.compareTo(input2) > 0) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
		System.out.println(input1.substring(0, 1).toUpperCase() + input1.substring(1) + " "
				+ input2.substring(0, 1).toUpperCase() + input2.substring(1));
		// System.out.println(StringUtils.capitalize(input1) + " " +
		// StringUtils.capitalize(input2));
	}
}
