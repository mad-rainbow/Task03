package lt.lhu.unit03.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(1000);
			}
		}

		for (int[] el1 : ar) {
			for (int el2 : el1) {
				System.out.printf("[%3d] ", el2);
			}
			System.out.println();
		}
		System.out.println();
		
		int k = rand.nextInt(5), p = rand.nextInt(5);
		
		System.out.println("Строка номер " + (k+1) + ":");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%3d] ", ar[k][i]);
		}
		
		System.out.println("\n\nСтолбец номер " + (p+1) + ":");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%3d] ", ar[i][p]);
		}

	}

}
