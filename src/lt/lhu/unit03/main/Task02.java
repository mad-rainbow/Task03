package lt.lhu.unit03.main;

import java.util.Arrays;
import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		Random rand = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		
		for (int el : ar) {
			System.out.printf("[%3d] ", el);
		}
		System.out.println("\n-----------------------------");
		
		Arrays.sort(ar);
		
		int min = ar[1] - ar[0];
		
		System.out.println("Наименьшая длина числовой оси = " + min);
		

	}

}
