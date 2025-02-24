package task6;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	public static <T> List<T> mergeListsAlternately(List<T> list1, List<T> list2) {
		List<T> mergedList = new ArrayList<>();
		int i = 0, j = 0;

		while (i < list1.size() || j < list2.size()) {
			if (i < list1.size())
				mergedList.add(list1.get(i++));
			if (j < list2.size())
				mergedList.add(list2.get(j++));
		}

		return mergedList;
	}

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 3, 5, 9);
		List<Integer> list2 = List.of(2, 4, 6, 8, 10);

		List<String> words1 = List.of("A", "C", "E", "H");
		List<String> words2 = List.of("B", "D", "F", "G", "I");

		System.out.println("Merged Integers: " + mergeListsAlternately(list1, list2));
		System.out.println("Merged Strings: " + mergeListsAlternately(words1, words2));
	}
}
