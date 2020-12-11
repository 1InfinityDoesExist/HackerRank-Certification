package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_Anagrams {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();
		int len = a.length();
		int[] charArray1 = new int[26];
		for (int iter = 0; iter < len; iter++) {
			int pos1 = (int) a.charAt(iter) - 97;
			charArray1[pos1] = charArray1[pos1] + 1;
			int pos2 = (int) b.charAt(iter) - 97;
			charArray1[pos2] = charArray1[pos2] - 1;
		}
		for (int iter = 0; iter < 26; iter++) {
			if (charArray1[iter] != 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
