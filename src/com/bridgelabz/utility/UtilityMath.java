package com.bridgelabz.utility;

import java.util.Arrays;

public class UtilityMath {

	
	public boolean LeapYearValidation(int year) {
		if (year >= 1582 && year <= 9999)
			return true;
		return false;

	}
	public boolean leapYear(int year) {

		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean checkValidationForDate(int month, int day, boolean leapYear) {

		switch (month) {
		case 1:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 2:
			if (leapYear) {
				if (day > 0 && day <= 29) {
					return true;
				} else {
					return false;
				}

			} else {
				if (day > 0 && day <= 28) {
					return true;
				} else {
					return false;
				}
			}

		case 3:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 4:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 5:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 6:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 7:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 8:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 9:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 10:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 11:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 12:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		default:
			System.out.println("Please enter valid input");
		}
		return false;

	}
	
	public static int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	
	public static int daysOfMonth(int month, boolean leapYear) {

		switch (month) {
		case 1:
			return 31;
		case 2:
			if (leapYear)
				return 29;
			else
				return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		}
		return 0;

	}
	
	public static boolean findStringAnagram(char[] str1Arr, char[] str2Arr) {
		if (str1Arr.length != str2Arr.length) {
			return false;
		} else {
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			for (int i = 0; i < str1Arr.length; i++) {
				if (str1Arr[i] != str2Arr[i]) {
					return false;
				}
			}
			return true;
		}

	}
	public static boolean findStringPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str != rev) {
			return false;
		} else
			return true;
	}
	
	public static void permutationRecursion(String str, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			System.out.print(str + " ");

		} else {
			for (int i = startIndex; i <= endIndex; i++) {
				str = swap(str, startIndex, i);
				// System.out.println("x="+str);
				permutationRecursion(str, startIndex + 1, endIndex);
				str = swap(str, startIndex, i);
				// System.out.println("y="+str);
			}
		}

	}
	public static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void permutationIterative(String str) {
		// sort the string in natural order
		char[] s = str.toCharArray();
		int n = str.length();
		Arrays.sort(s);

		while (true) {
			// Print current permutation
			System.out.print(String.valueOf(s) + " ");

			/*
			 * Below code will rearrange the string to next lexicographically ordered
			 * permutation (if any) or return if we are already at highest possible
			 * permutation
			 */

			// Find largest index i such that s[i-1] is less than s[i]
			int i = n - 1;
			while (s[i - 1] >= s[i]) {
				// if i is first index of the string, that means we are
				// already at last possible permutation
				// (string is sorted in reverse order)
				if (--i == 0)
					return;
			}

			// find highest index j to the right of index i such that
			// s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)

			int j = n - 1;
			while (j > i && s[j] <= s[i - 1])
				j--;

			// Swap characters at index i-1 with index j
			swap(s, i - 1, j);

			// reverse the substring s[i..n-1] and return true
			reverse(s, i, n - 1);
		}
	}

	// Utility function to swap two characters in a character array
	private static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	// Utility function to reverse a char array between specified indices
	private static void reverse(char[] arr, int i, int j) {
		// do till two end-points intersect
		while (i < j) {
			swap(arr, i++, j--);
		}
	}
	
	
	/*DAY 5
	 a.to return an harmonic number
	 b.to return a sin of an angle.
	 c.to return cosine of an angle.
	 d.to return binary of a number.*/
	public static void PrintHarmonic(int number) {
		System.out.print("H=");
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print("1/" + i);
				System.out.print(" + ");
			} else {
				System.out.print("1/" + i);
			}

		}

	}
	
	public static double findRadiun(int degree) {
		return Math.toRadians(degree);
	}

	
	public static double findSin(double radiun) {
		return Math.sin(radiun);
	}

	
	public static double findCos(double radiun) {
		return Math.cos(radiun);
	}
	
	
	public static String findBinary(int decimalNumber) {
		int  mod;
		
		String x = "";
		if (decimalNumber > 255) {
			System.out.println("Enter Number between 1 to 255");
		} else {

			while (decimalNumber > 0) {
				mod = decimalNumber % 2;
				x = mod + "" + x;
				decimalNumber = decimalNumber / 2;
			}

		}
		return x;
	}
	/*sqrt()*/
	
	public static double findSquareRootUsingNewtonsMethod(int c, double epsilon) {
		double t;
		t = c;
//		epsilon=1*(Math.pow(10, -15));
		

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	/*Find Factorial Number*/
	

	public static long CalculateFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	/*Future Investment Value*/
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
	{
		double result=investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		return result; 
	}

	
	/*Present value*/
	
	public static double presentInvestmentValue(double investmentAmt, double d, int i) 
	{
		double result=investmentAmt / Math.pow(1 + d, i * 12);
		return result;
	}
		public static int getMax(int[] inputArray)
		{ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++)
		    { 
		      if(inputArray[i] > maxValue)
		      { 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		public static int getMin(int[] inputArray)
		{ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++)
		    { 
		      if(inputArray[i] < minValue)
		      { 
		         minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  }
	
}



	

	
	













