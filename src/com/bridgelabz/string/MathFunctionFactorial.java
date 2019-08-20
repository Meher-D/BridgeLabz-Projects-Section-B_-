package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;

public class MathFunctionFactorial {

	public static void main(String[] args) {
		UtilityMath utilityMath=new UtilityMath();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:-:-");
		int n=scanner.nextInt();
		System.out.print("Factorial of given number :-");
		System.out.println(utilityMath.CalculateFact(n));
           
	}

}

