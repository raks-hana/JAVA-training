package task5;

class MatrixMultiplier implements Runnable {
	private int[][] A, B, result;
	private int row, col, size;

	public MatrixMultiplier(int[][] A, int[][] B, int[][] result, int row, int col, int size) {
		this.A = A;
		this.B = B;
		this.result = result;
		this.row = row;
		this.col = col;
		this.size = size;
	}

	public void run() {
		result[row][col] = 0;
		for (int k = 0; k < size; k++) {
			result[row][col] += A[row][k] * B[k][col];
		}
	}
}

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		int[][] B = { { 5, 6 }, { 7, 8 } };
		int[][] result = new int[2][2];

		Thread[][] threads = new Thread[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				threads[i][j] = new Thread(new MatrixMultiplier(A, B, result, i, j, 2));
				threads[i][j].start();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				threads[i][j].join();
			}
		}

		System.out.println("Resultant Matrix:");
		for (int[] row : result) {
			System.out.println(java.util.Arrays.toString(row));
		}
	}
}
