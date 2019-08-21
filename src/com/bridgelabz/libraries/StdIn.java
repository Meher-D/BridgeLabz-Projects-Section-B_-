package com.bridgelabz.libraries;

import java.util.Scanner;

public class StdIn 
{

	public static final String scanner = null;
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Type a string: ");
        String s = BLStdIn.readString();
        System.out.println("Your string was: " + s);
        System.out.println();

        System.out.print("Type an int: ");
        int a = BLStdIn.readInt();
        System.out.println("Your int was: " + a);
        System.out.println();

        System.out.print("Type a boolean: ");
        boolean b = BLStdIn.readBoolean();
        System.out.println("Your boolean was: " + b);
        System.out.println();

        System.out.print("Type a double: ");
        double c = BLStdIn.readDouble();
        System.out.println("Your double was: " + c);
        System.out.println();
 scanner.close();
	}

}