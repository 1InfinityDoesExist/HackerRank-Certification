package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Java_Stdin_and_Stdout_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		for (int iter = 0; iter < 3; iter++) {
			list.add(Integer.valueOf(bufferedReader.readLine()));
		}
		list.stream().forEach(System.out::println);
	}
}
