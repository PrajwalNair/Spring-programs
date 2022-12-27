package com.xworkz.apti;

public class Pattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//				int j = 1; j <= i; j++ for rising star
//				int j = i; j <= n; j++ for landing star

			System.out.println("  ");

		}

		for (int i =1 ; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
//				int j = 1; j <= i; j++ for rising star
//				int j = i; j <= n; j++ for landing star

			System.out.println("  ");

		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//	int j = 1; j <= i; j++ for rising star
//	int j = i; j <= n; j++ for landing star

			System.out.println("  ");

		}

		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
//	int j = 1; j <= i; j++ for rising star
//	int j = i; j <= n; j++ for landing star

			System.out.println("  ");

		}

	}

}
