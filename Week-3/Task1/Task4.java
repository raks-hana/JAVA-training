package task1;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] copyArray = Arrays.copyOfRange(originalArray, 1, 7);

		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Copy Array: " + Arrays.toString(copyArray));
	}
}
