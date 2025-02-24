package task1;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	String name;
	int[] marks;
	int total;
	double average;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		this.total = Arrays.stream(marks).sum();
		this.average = total / (double) marks.length;
	}
}

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		Student[] students = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter student name: ");
			String name = sc.next();
			System.out.print("Enter number of subjects: ");
			int subjCount = sc.nextInt();
			int[] marks = new int[subjCount];

			for (int j = 0; j < subjCount; j++) {
				System.out.print("Enter marks for subject " + (j + 1) + ": ");
				marks[j] = sc.nextInt();
			}

			students[i] = new Student(name, marks);
		}

		Arrays.sort(students, (s1, s2) -> s2.total - s1.total);

		System.out.println("\nSorted Student List:");
		for (Student s : students) {
			System.out.println(s.name + " - Total: " + s.total + ", Average: " + s.average);
		}

		sc.close();
	}
}
