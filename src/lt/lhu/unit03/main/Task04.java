package lt.lhu.unit03.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int[] ar = new int[10];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

		for (int el : ar) {
			System.out.printf("[%3d] ", el);
		}

		System.out.println("\n");

		boolean sort = false;
		int temp;
		while (!sort) {
			sort = true;
			for (int i = 0; i < ar.length-1; i++) {
				if (ar[i] < ar[i+1]) {
					temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
					sort = false;
				}
			}
		}

		for (int el : ar) {
			System.out.printf("[%3d] ", el);
		}
	}
}
