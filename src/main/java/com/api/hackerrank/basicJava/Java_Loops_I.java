package com.api.hackerrank.basicJava;

import java.io.*;

public class Java_Loops_I {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(bufferedReader.readLine());
		for (int iter = 1; iter <= 10; iter++) {
			System.out.println(String.format("%d x %d = %d", num, iter, num * iter));
		}
	}
}
