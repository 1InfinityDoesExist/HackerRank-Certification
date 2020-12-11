package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(bufferedReader.readLine());
		while (testCases-- > 0) {
			String regex = bufferedReader.readLine();
			try {
				Pattern.compile(regex);
				System.out.println("Valid");
			} catch (final PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
	}
}
