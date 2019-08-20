package com.bridgelabz.string;

import java.util.Scanner;


import com.bridgelabz.utility.UtilityMath;

public class StringFunctions {

	public static void main(String[] args) {
		UtilityMath utilityMath = new UtilityMath();
		 Scanner scanner=new Scanner(System.in);
			String str1,str2;
			
			char [] str1Arr, str2Arr;
			
			System.out.println("Enter first string: ");
			str1=scanner.next();
			System.out.println("Enter second string: ");
			str2=scanner.next();
			str1Arr=str1.toCharArray();
			str2Arr=str2.toCharArray();
			if(utilityMath.findStringAnagram(str1Arr,str2Arr)) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
			scanner.close();

	}

}
