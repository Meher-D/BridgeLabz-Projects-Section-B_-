package com.bridgelabz.libraries;

import java.util.Random;
import java.util.Scanner;

public class StdRandom {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scanner.nextInt();
		
		
		if (n == 2) 
	        	BLRandom.StdRandom.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	        int[] frequencies = { 5, 3, 1, 1 };
	        String[] a = "A B C D E F G".split(" ");

	       //System.out.println("seed = " + BLRandom.StdRandom.getSeed());
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.printf("%2d ",   BLRandom.StdRandom.uniform(100));
	            System.out.printf("%8.5f ", BLRandom.StdRandom.uniform(10.0, 99.0));
	           System.out.printf("%5b ",   BLRandom.StdRandom.bernoulli(0.5));
	           System.out.printf("%7.5f ", BLRandom.StdRandom.gaussian(9.0, 0.2));
	           System.out.printf("%1d ",   BLRandom.StdRandom.discrete(probabilities));
	           
	            
	             BLRandom.StdRandom.shuffle(a);
	            for (String s : a)
	                System.out.print(s);
	            System.out.println();
	            scanner.close();

	        }
	}
}




