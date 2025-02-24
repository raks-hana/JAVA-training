package task9;

import java.util.List;

public class Task5 {
	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "apricot", "blueberry", "avocado");

		long count = words.stream().filter(word -> word.startsWith("a")).count();

		System.out.println("Words starting with 'a': " + count);
	}
}
