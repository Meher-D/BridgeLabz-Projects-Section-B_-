package com.bridgelabz.libraries;

import java.util.Random;
import java.util.Scanner;

public class StdRandom {

	 public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);
	        if (args.length == 2) StdRandom.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	        int[] frequencies = { 5, 3, 1, 1 };
	        String[] a = "A B C D E F G".split(" ");

	        System.out.println("seed = " + StdRandom.getSeed());
	        for (int i = 0; i < n; i++) {
	            StdOut.printf("%2d ",   uniform(100));
	            StdOut.printf("%8.5f ", uniform(10.0, 99.0));
	            StdOut.printf("%5b ",   bernoulli(0.5));
	            StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
	            StdOut.printf("%1d ",   discrete(probabilities));
	            StdOut.printf("%1d ",   discrete(frequencies));
	            StdOut.printf("%11d ",  uniform(100000000000L));
	            StdRandom.shuffle(a);
	            for (String s : a)
	                StdOut.print(s);
	            StdOut.println();
	        }
	    }	
	

