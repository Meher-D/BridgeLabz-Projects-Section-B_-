package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;

public class PresentValue {

	public static void main(String[] args) 
	{
		UtilityMath utilityMath = new UtilityMath();
	    Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		double investmentAmt=scanner.nextInt();
		System.out.println("Enter rate : ");
		double rateOfInt=scanner.nextFloat();
		System.out.println("Enter Years : ");
		int year=scanner.nextInt();
		double rate;
	    rate =rateOfInt * 0.01;
		System.out.println("Years and PresentValue");
		
		for(int i = 1; i <= year; i++) 
		{
	    	int formatter = 19;
		    if (i >= 10) 
		    	formatter = 18;
		    System.out.println(i);
		   System.out.println(utilityMath.presentInvestmentValue(investmentAmt,rate/12,i));
		}

	}
}
