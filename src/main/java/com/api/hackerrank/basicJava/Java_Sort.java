package com.api.hackerrank.basicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private Integer studentId;
	private String firstName;
	private Double cgpa;

	public Student(Integer studentId, String firstName, Double cgpa) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.cgpa = cgpa;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public Double getCgpa() {
		return cgpa;
	}

}

class StudentBuilder {
	private Integer studentId;
	private String firstName;
	private Double cgpa;

	public StudentBuilder setStudentId(Integer studentId) {
		this.studentId = studentId;
		return this;
	}

	public StudentBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public StudentBuilder setCgpa(Double cgpa) {
		this.cgpa = cgpa;
		return this;
	}

	public Student getStuden() {
		return new Student(studentId, firstName, cgpa);
	}

}

public class Java_Sort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfStudents = scanner.nextInt();
		List<Student> students = new ArrayList<Student>();
		for (int iter = 0; iter < noOfStudents; iter++) {
			students.add(new StudentBuilder().setStudentId(scanner.nextInt()).setFirstName(scanner.next())
					.setCgpa(scanner.nextDouble()).getStuden());
		}
		Collections.sort(students, Comparator.comparing(Student::getCgpa).reversed()
				.thenComparing(Student::getFirstName).thenComparing(Student::getStudentId));
		students.stream().forEach(stud -> {
			System.out.println(stud.getFirstName());
		});
		scanner.close();
	}

}
