package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		Utility utility = new Utility();    
		String str;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		str=scanner.next();
		int strLength=str.length()-1;
		//Permutation with recursion
		System.out.println("Printing Recursive Permutation");
		utility.permutationRecursion(str, 0, strLength);
		
		System.out.println("Printing Iterative Permutation");
		utility.permutationIterative(str);
		scanner.close();

	}

}
