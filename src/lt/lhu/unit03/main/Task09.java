package lt.lhu.unit03.main;

public class Task09 {

	public static void main(String[] args) {
		int[][] ar = new int[6][6];

		for (int i = 0, j = ar.length-1; i < ar.length; i++) {
			ar[i][j] = i+1;
			j--;
			}
		
		for (int[] el1 : ar) {
			for (int el2 : el1) {
				System.out.printf("[%d]", el2);
			}
			System.out.println();
		}

	}
}