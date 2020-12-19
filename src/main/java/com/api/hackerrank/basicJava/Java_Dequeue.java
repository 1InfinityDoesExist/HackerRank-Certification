package com.api.hackerrank.basicJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java_Dequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		Set<Integer> s = new HashSet<>();
		long max = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			s.add(num);
			if (deque.size() == m) {
				max = Math.max(max, s.size());
				int firstElement = (int) deque.remove();
				if (!deque.contains(firstElement)) {
					s.remove(firstElement);
				}
			}
		}
		in.close();
		System.out.println(max);
	}
}
