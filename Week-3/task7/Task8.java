package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Green", "Red", "Blue"));
		Collections.sort(colors);

		System.out.println("Sorted List: " + colors);
	}
}
