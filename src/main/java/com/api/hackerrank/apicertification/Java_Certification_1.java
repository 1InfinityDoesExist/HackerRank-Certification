package com.api.hackerrank.apicertification;

public class Java_Certification_1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		Adder adder = new Adder();
		System.out.println(adder.add(a, b));
	}
}

abstract class Calculator {
	public abstract int add(int a, int b);
}

class Adder extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
