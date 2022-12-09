package com.xworkz.apti;

public class SeperateEvenOdd {
	public static void main(String[] args) {
		// seperate even and odd
		int[] b = { 20, 37, 58, 69, 99, 70, 87, 18, 9 };

		for (int c = 0; c < b.length - 1; c++) {
			if (c % 2 == 0) {
				System.out.println("even" + b[c]);
			} else {
				System.out.println("odd" + b[c]);
			}

		}
	}

}
