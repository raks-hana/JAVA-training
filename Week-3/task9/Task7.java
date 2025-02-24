package task9;

import java.util.List;

public class Task7 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 20, 5, 50, 30, 100);

		int minValue = numbers.stream().min(Integer::compareTo).orElseThrow();

		int maxValue = numbers.stream().max(Integer::compareTo).orElseThrow();

		System.out.println("Minimum Value: " + minValue);
		System.out.println("Maximum Value: " + maxValue);
	}
}
