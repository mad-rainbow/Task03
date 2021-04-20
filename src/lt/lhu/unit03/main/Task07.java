package lt.lhu.unit03.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int[][] ar = new int[7][7];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
		}

		for (int[] el1 : ar) {
			for (int el2 : el1) {
				System.out.printf("[%d] ", el2);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("{%d} ", ar[i][i]);
		}

	}
}