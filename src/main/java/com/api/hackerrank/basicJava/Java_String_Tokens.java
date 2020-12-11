package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java_String_Tokens {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		if (input.trim().length() == 0 || input.trim().length() > 400000) {
			System.out.println(0);
			return;
		} else {
			String[] tokens = input.trim().split("[ !,?.\\_'@]+");
			System.out.println(tokens.length);
			Arrays.stream(tokens).forEach(System.out::println);
		}
		bufferedReader.close();
		return;
	}
}
