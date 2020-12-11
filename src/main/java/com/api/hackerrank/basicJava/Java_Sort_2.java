
package com.api.hackerrank.basicJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java_Sort_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfStudents = scanner.nextInt();
		List<Student> students = new ArrayList<Student>();
		for (int iter = 0; iter < noOfStudents; iter++) {
			students.add(new StudentBuilder().setStudentId(scanner.nextInt()).setFirstName(scanner.next())
					.setCgpa(scanner.nextDouble()).getStudent());
		}
		students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFirstName)
				.thenComparing(Student::getStudentId)).map(s -> s.getFirstName()).forEach(System.out::println);
		scanner.close();
	}

}
