package com.bridgelabz.libraries;

import java.util.Scanner;

public class StdOut {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("Enter String: ");
		 str=scanner.nextLine();
		 
		 
		 BLStdOut.println("Test");
		 BLStdOut.print("Value");
	        BLStdOut.println();
	        BLStdOut.println(true);
	        BLStdOut.printf("%.6f\n", 1.0/7.0);

	}

}
