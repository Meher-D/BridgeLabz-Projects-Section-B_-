package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;

public class MathFunctionSqrt {

	public static void main(String[] args) {
		UtilityMath utilityMath=new UtilityMath();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to find sqrt using newtons method:-");
		int c = scanner.nextInt();
		double epsilon = 1e-15;
		System.out.println(utilityMath.findSquareRootUsingNewtonsMethod(c, epsilon));
		scanner.close();
	}

}
