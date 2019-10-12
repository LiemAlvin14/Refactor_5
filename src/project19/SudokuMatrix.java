package project19;

import java.util.Random;

public class SudokuMatrix {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] sub_matrices = new int[3][3];
		System.out.println("Sodoku matrix");
		// print a sodoku matrix
		for (int t = 0; t < 9; t++) {
			// print a sub matrix 3x3
			for (int high = 0; high < 3; high++) {
				for (int width = 0; width < 3; width++) {
					// a sub matrix
					for (int i = 0; i < SodokuCommon.WIDTH_HIGH_MATRICES; i++) {
						for (int j = 0; j < SodokuCommon.WIDTH_SUB_MATRICES; j++) {
							int number_random = random.nextInt(SodokuCommon.RANGE_RANDOM);
							sub_matrices[i][j] = number_random;
						}
					}
					System.out.print(sub_matrices[high][width] + " ");
				}
				System.out.println();
			}
			System.out.println("=====");
		}
	}
}
