package com.api.hackerrank.string;

public class String_Chars {

	// Iterate over characters of a String
	public static void main(String[] args) {
		String s = "Techie Delight";

		// 1. Implicit Boxing into Stream<Character>

		// 1.1. using method reference
		s.chars().mapToObj(Character::toChars).forEach(System.out::print);

		// 1.2. using lambda expressions by casting int to char
		s.chars().mapToObj(i -> new Character((char) i)).forEach(System.out::print);

		s.chars().mapToObj(i -> Character.valueOf((char) i)).forEach(System.out::print);

		s.chars().mapToObj(i -> (char) i).forEach(System.out::print);

		s.chars().mapToObj(i -> new StringBuilder().appendCodePoint(i)).forEach(System.out::print);

		// 2. Without Boxing into Stream<Character>

		s.chars().forEach(i -> System.out.print(new Character((char) i)));

		s.chars().forEach(i -> System.out.print(Character.toChars(i)));

		s.chars().forEach(i -> System.out.print((char) i));

		s.chars().forEach(i -> System.out.print(new StringBuilder().appendCodePoint(i)));
	}
}
