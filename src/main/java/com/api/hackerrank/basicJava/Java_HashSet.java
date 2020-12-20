package com.api.hackerrank.basicJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java_HashSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		Set<ArrayList<String>> set = new HashSet<>();
		for (int iter = 0; iter < t; iter++) {
			ArrayList<String> data = new ArrayList<>();
			data.add(pair_left[iter]);
			data.add(pair_right[iter]);
			set.add(data);
			System.out.println(set.size());
		}
	}
}