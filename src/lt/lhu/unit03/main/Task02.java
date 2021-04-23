package lt.lhu.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		Random rand = new Random();
		int min, max;
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		min = ar[0];
		max = ar[0];
		
		for (int el : ar) {
			System.out.printf("[%3d] ", el);
			if (min > el) {
				min = el;
			}
			if (max < el) {
				max = el;
			}
		}
		System.out.println("\n-----------------------------");
		
		int axisLength = max - min;
		
		System.out.println("Наименьшая длина числовой оси = " + axisLength);
		

	}

}
