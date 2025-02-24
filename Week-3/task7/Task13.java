package task7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task13 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue", "Green", "Yellow"));
		Iterator<String> iterator = list.listIterator(2);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
