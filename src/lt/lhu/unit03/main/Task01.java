package lt.lhu.unit03.main;

public class Task01 {

	public static void main(String[] args) {
		int[] ar1 = { 421, 733, 953, 343, 423 };

		int n = 0;
		for (int number : ar1) {
			if (number % 2 == 0) {
				n += 1;
			}
		}

		int[] ar2 = new int[n];

		for (int i = 0, j = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				ar2[j] = ar1[i];
				j++;
			}
		}

		if (n == 0) {
			System.out.println("Нет четных чисел.");
		} else {
			for (int el : ar2) {
				System.out.printf("[%3d] ", el);
			}
		}
	}
}