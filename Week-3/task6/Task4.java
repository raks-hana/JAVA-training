package task6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
	public static <T> List<T> reverseList(List<T> list) {
		List<T> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);
		return reversedList;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> words = List.of("one", "two", "three", "four", "five");

		System.out.println("Reversed numbers: " + reverseList(numbers));
		System.out.println("Reversed words: " + reverseList(words));
	}
}
