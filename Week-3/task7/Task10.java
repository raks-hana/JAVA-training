package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green"));
		Collections.shuffle(colors);

		System.out.println("Shuffled List: " + colors);
	}
}
