package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;

public class MathFunctionInterest {

	public static void main(String[] args) 
	{

		UtilityMath utilityMath = new UtilityMath();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		double investment=scanner.nextInt();
		System.out.println("Enter rate : ");
		double rate=scanner.nextFloat();
		System.out.println("Enter Years : ");
		int years=scanner.nextInt();
		
		rate =rate* 0.01;
		System.out.println("Years and FutureValue");
		
		for(int i = 1; i <= years; i++) 
		{
	    	int formatter = 19;
		    if (i >= 10) 
		    	formatter = 18;
		    System.out.println(i);
		   System.out.println(utilityMath.futureInvestmentValue(investment,rate/12,i));
		}
	}

}
