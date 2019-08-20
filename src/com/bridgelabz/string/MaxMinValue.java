package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;

public class MaxMinValue {

	public static void main(String[] args) 
	{
		UtilityMath utilityMath = new UtilityMath();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Elements in array :");
		int n=scanner.nextInt();
		int[] a=new int[n];
		System.out.println("Enter all the Elements for array:");
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		int result=utilityMath.getMax(a);
		System.out.println("Max value is : "+result);
		
		
	
		System.out.println("Enter Elements in array :");
		int num=scanner.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter all the Elements for array:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int result1=utilityMath.getMin(arr);
		System.out.println("Min value is : "+result1);
		
		
	}

}
