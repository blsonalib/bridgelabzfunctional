package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf 
{

	public static void main(String[] args) 
	{
		int number,i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=scanner.nextInt();
		System.out.println("power of 2^"+number+"is:"+Math.pow(number, 2));
		System.out.println();
		System.out.println("The number is:"+number);
		Utility.PowerOf(number, i);
	}

}
 