package com.bridgelabz.utility;

import java.util.Arrays;

public class UtilityStates {

	public static double max(double[] arr) {

		double max = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static double min(double[] arr) {
		double min = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static double mean(double[] a) {
		double sum = 0;
		for (int i = 0; i <= a.length-1; i++) {
			sum = sum + a[i];
		}
		return sum / (a.length );
	}

	public static double var(double[] a) {
		int n =  a.length+1;
		double mean = mean(a),sum=0;
		double[] temp = new double[n];
		double[] sqttemp = new double[n];
		for(int i=0;i<a.length;i++) 
		{
			temp[i]=a[i]-mean;
			sqttemp[i] = Math.pow(Math.abs(temp[i]), 2);
			
		}
		
		for (int i = 0; i <= a.length; i++)
		{
			sum = sum + sqttemp[i];
		}
		
		return sum/(n-1);
	}

	public static double stddev(double[] a) {
		return Math.sqrt(var(a));
	}

	public static double median(double[] a) {
		int n=a.length;;
		 // First we sort the array 
        Arrays.sort(a); 
  
        // check for even case 
        if (n % 2 != 0) 
            return (double)a[n / 2]; 
  
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
	}

}
