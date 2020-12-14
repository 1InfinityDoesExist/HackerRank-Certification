package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Java_Regex {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line.matches(new MyRegex().pattern));
		}
	}
}

class MyRegex {
	public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";
}