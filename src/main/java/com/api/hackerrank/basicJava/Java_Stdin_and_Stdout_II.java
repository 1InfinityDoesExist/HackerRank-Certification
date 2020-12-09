package com.api.hackerrank.basicJava;

import java.io.*;

/*
Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

*/
public class Java_Stdin_and_Stdout_II {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int intData = Integer.valueOf(bufferedReader.readLine());
		Double doubleData = Double.valueOf(bufferedReader.readLine());
		String stringData = bufferedReader.readLine();
		System.out.println("String: " + stringData);
		System.out.println("Double: " + doubleData);
		System.out.println("Int: " + intData);
	}
}
