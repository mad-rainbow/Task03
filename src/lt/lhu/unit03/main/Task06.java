package lt.lhu.unit03.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(5)+5, m = rand.nextInt(5)+5;
		int[][] ar = new int[n][m];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
		}
		
		int count = 0;
		
		for (int[] el1 : ar) {
			for (int el2 : el1) {
				if(el2 == 7) {
					count++;
				}
				System.out.printf("[%d] ", el2);
			}
			System.out.println();
		}
		System.out.println("\nЧисло 7 встречается: " + count + " раз.");
	}

}
