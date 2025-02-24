package task6;

import java.util.Arrays;

public class Task1 {
	public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
		return Arrays.equals(array1, array2);
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 };
		Integer[] arr2 = { 1, 2, 3, 4 };
		String[] strArr1 = { "apple", "banana" };
		String[] strArr2 = { "apple", "orange" };

		System.out.println("Arrays equal (Integers): " + areArraysEqual(arr1, arr2));
		System.out.println("Arrays equal (Strings): " + areArraysEqual(strArr1, strArr2));
	}
}
