package lt.lhu.unit03.main;

public class Task10 {

	public static void main(String[] args) {
		int[][] ar = new int[6][6];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == 0 | i == ar.length - 1) {
					ar[i][j] = 1;
				} else if (j == 0 | j == ar[i].length - 1) {
					ar[i][j] = 1;
				}
			}
		}

		for (int[] el1 : ar) {
			for (int el2 : el1) {
				System.out.printf("[%d]", el2);
			}
			System.out.println();
		}
	}

}
