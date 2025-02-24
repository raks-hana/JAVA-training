package task9;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
	public static void main(String[] args) {
		List<String> words = List.of("banana", "apple", "cherry", "date");

		List<String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());

		List<String> descendingOrder = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

		System.out.println("Ascending Order: " + ascendingOrder);
		System.out.println("Descending Order: " + descendingOrder);
	}
}
