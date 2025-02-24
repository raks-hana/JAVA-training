package task5;

import java.util.Arrays;

class Sort extends Thread {
	private int[] arr;

	public Sort(int[] arr) {
		this.arr = arr;
	}

	public void run() {
		Arrays.sort(arr);
	}

	public int[] getSortedArray() {
		return arr;
	}
}

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		int[] arr1 = { 7, 3, 1, 8, 5 };
		int[] arr2 = { 10, 6, 2, 9, 4 };

		Sort thread1 = new Sort(arr1);
		Sort thread2 = new Sort(arr2);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("Sorted Array 1: " + Arrays.toString(thread1.getSortedArray()));
		System.out.println("Sorted Array 2: " + Arrays.toString(thread2.getSortedArray()));
	}
}
