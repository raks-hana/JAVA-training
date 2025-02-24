package task7;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green"));
		System.out.println("Contains Blue?: " + colors.contains("Blue"));
	}
}
