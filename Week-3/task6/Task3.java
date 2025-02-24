package task6;

import java.util.List;

public class Task3 {
	public static <T> int findIndex(List<T> list, T target) {
		return list.indexOf(target);
	}

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "orange");
		List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);

		System.out.println("Index of 'banana': " + findIndex(words, "banana"));
		System.out.println("Index of 30: " + findIndex(numbers, 60));
		System.out.println("Index of 100: " + findIndex(numbers, 100)); 
	}
}
