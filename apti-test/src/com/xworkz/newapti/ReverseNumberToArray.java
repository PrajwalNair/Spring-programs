package com.xworkz.newapti;

public class ReverseNumberToArray {
	public static void main(String[] args) {
		int a = 35231;
		
		String string = Integer.toString(a);
		
		String str = string;
		String rev="";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev.toCharArray());
	}

}
