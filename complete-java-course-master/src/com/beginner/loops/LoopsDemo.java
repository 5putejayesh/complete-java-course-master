package com.beginner.loops;

public class LoopsDemo {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 0) {
			System.out.println(i + ". Being right sucks");
			i++;
		}

		System.out.println("Value of i: " + i);
		System.out.println();

		int j = 1;
		do {
			System.out.println(j + ". Being right sucks");
		} while (j <= 0);

		System.out.println("Value of j: " + j);
		System.out.println();

		for (int k = 0; k < 5; k++) {
			if (k == 3)
				break;
			System.out.println(k + ". Being right sucks");
		}
		System.out.println();
		for (int k = 0; k < 5; k++) {
			if (k == 3)
				continue;
			System.out.println(k + ". Being right sucks");
		}

		for (int l = 2; l >= 0; l--) {
			for (int m = 0; m <= 4; m++) {
				if (m >= l && m <= 4 - l)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
