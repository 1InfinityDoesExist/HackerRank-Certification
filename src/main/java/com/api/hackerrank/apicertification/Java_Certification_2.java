package com.api.hackerrank.apicertification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Balanced {

	public static boolean isBalanced(String par) {

		Deque<Character> deque = new ArrayDeque<>();
		for (int iter = 0; iter < par.length(); iter++) {
			char left = par.charAt(iter);
			if (left == '{' || left == '(' || left == '[') {
				deque.push(left); // do not use deque.add(left)
				continue;
			}
			if (deque.isEmpty()) {
				return false;
			}
			switch (left) {
			case ')':
				if (deque.pop() != '(') {
					return false;
				}
				break;
			case '}':
				if (deque.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if (deque.pop() != '[') {
					return false;
				}
				break;
			}
		}
		return deque.isEmpty();
	}
}

public class Java_Certification_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = bufferedReader.readLine()) != null) {
			if (Balanced.isBalanced(input)) {
				System.out.println("Balanced Parenthesis");
			} else {
				System.out.println("Not A Balanced Parenthesis");
			}
		}
	}
}
