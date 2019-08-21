package com.bridgelabz.string;

import com.bridgelabz.utility.UtilityStates;

public class BLStates {

	public static void main(String[] args) {
       
		double a[]= {3,4,5,6};
		System.out.println( "Max = "+UtilityStates.max(a));
		System.out.println( "Min = "+UtilityStates.min(a));
		System.out.println( "Var = "+UtilityStates.var(a));
		System.out.println( "Std dev = "+UtilityStates.stddev(a));
		System.out.println( "Median = "+UtilityStates.median(a));

	}

}
