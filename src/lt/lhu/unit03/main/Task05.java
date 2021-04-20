package lt.lhu.unit03.main;

import java.util.Random;

public class Task05 {

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

		int temp;

		for (int i = 1; i < ar.length; i++) {
			temp = ar[i];
			while (i > 0 && ar[i - 1] >= temp) {
				ar[i] = ar[i - 1];
				--i;
			}
			ar[i] = temp;
		}

		for (int el : ar) {
			System.out.printf("[%3d] ", el);
		}
	}
}