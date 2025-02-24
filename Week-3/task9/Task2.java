package task9;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		List<String> names = List.of("apple", "banana", "cherry");

		List<String> uppercaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

		List<String> lowercaseNames = names.stream().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println("Uppercase: " + uppercaseNames);
		System.out.println("Lowercase: " + lowercaseNames);
	}
}
