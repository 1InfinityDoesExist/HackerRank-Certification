package com.api.hackerrank.string;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Iterator {
	public static void main(String[] args) {
		String str = "Destroy the system that created it. You should have trusted me to finish the job.";
		CharacterIterator it = new StringCharacterIterator(str);
		while (it.current() != CharacterIterator.DONE) {
			System.out.print(it.current());
			it.next();
		}
	}

}
