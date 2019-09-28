package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringName
{

	public static void main(String[] args)
	{
		String Username;
		Scanner  scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		Username= scanner.next();
		int length=Username.length(); //fetch length of the program
		Utility.StringName(Username, length);
	}
}
