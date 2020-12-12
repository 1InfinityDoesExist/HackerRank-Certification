package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_Substring_Comparisons {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String data = bufferedReader.readLine().trim();
		int len = Integer.parseInt(bufferedReader.readLine());
		String min;
		String max;
		if (data.length() >= 1 && data.length() <= 1000 && data.length() >= len) {
			min = data.substring(0, len);
			max = data.substring(0, len);
			for (int iter = 0; iter < data.length() - len + 1; iter++) {
				min = min.compareTo(data.substring(iter, iter + len)) > 0 ? data.substring(iter, iter + len) : min;
				max = max.compareTo(data.substring(iter, iter + len)) < 0 ? data.substring(iter, iter + len) : max;
			}
			System.out.println(min);
			System.out.println(max);
		}
	}
}
