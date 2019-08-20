package com.bridgelabz.string;
import java.util.Scanner;

import com.bridgelabz.utility.UtilityMath;
public class MathFunctionweek1 {

	public static void main(String[] args)
	{
		UtilityMath utilityMath=new UtilityMath();
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter\na.harmonic number\n" + "b.sin of angle\n" + "c.cosine of angle\n" + "d.binary number");
			char option;
			option = scanner.next().charAt(0);
			switch (option)
			{
			case 'a':
				System.out.println("Enter number for harmonic number");
				int number = scanner.nextInt();
				utilityMath.PrintHarmonic(number);
				break;
			case 'b':
				System.out.println("Enter angle to find sin");
				int angle = scanner.nextInt();
				double radian = utilityMath.findRadiun(angle);
				double sin = utilityMath.findSin(radian);
				System.out.println("Sin(" + angle + ") = " + sin);
				break;
			case 'c':
				System.out.println("Enter angle to find cosine");
				int angle2 = scanner.nextInt();
				double radian2 = utilityMath.findRadiun(angle2);
				double cos = utilityMath.findSin(radian2);
				System.out.println("Cos(" + angle2 + ") = " + cos);
				break;
			case 'd':
				int decimalNumber;
				System.out.println("Enter a number");
				decimalNumber = scanner.nextInt();
				System.out.println("Binary is: " + utilityMath.findBinary(decimalNumber));
				break;
			}

	}

}
