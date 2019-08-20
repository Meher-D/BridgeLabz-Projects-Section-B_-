package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;



public class Palin {

	public static void main(String[] args) {

		UtilityMath utilityMath = new UtilityMath();
		Scanner scanner=new Scanner(System.in);
		String str;
		
		System.out.println("Enter String to find palidrome or not");
		str=scanner.next();
		if(!utilityMath.findStringPalindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		scanner.close();
	}

}
