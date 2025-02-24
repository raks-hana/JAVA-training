package task7;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green"));
		colors.set(1, "Yellow");

		System.out.println("Updated List: " + colors);
	}
}
