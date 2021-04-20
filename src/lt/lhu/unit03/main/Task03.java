package lt.lhu.unit03.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int N = rand.nextInt(20)+5;
		int[] ar = new int[N];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt((1000 - (-1000)) + 1) + (-1000);
			if (ar[i] < -800 | ar[i] > 800) {
				ar[i] = 0;
			}
		}
		
		for (int el : ar) {
			System.out.printf("[%3d] ", el);
		}
		int n = 0, p = 0, z = 0;
		
		for (int el : ar) {
			if (el < 0) {
				n++;
			}else if (el > 0) {
				p++;
			}else {
				z++;
			}
		}
		
		System.out.println("\n\nОтрицательные = " + n + "\nПоложительные = " + p + "\nНулевые = " + z);
		
	}

}
