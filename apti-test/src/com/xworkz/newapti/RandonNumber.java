package com.xworkz.newapti;

import java.util.Random;
import java.util.Scanner;

public class RandonNumber {
	public static class RandomNumber {

		public static void main(String[] args)
		{
			int maxRange;

	       
			
	        Scanner random = new Scanner(System.in);
	        Random rand = new Random();
	        
	        System.out.print("Please enter maximum range: ");
	        maxRange=random.nextInt();
	        
	        for(int loop=1; loop<=10; loop++)
	        {
	            System.out.println(rand.nextInt(maxRange));
	        }
		}
	}

}
