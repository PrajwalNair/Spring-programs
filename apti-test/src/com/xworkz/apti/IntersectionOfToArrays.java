package com.xworkz.apti;

import java.util.Collection;
import java.util.stream.Collectors;

public class IntersectionOfToArrays {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 9, 10 };
		int b[] = { 2, 8, 6, 1, 7, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
