package com.bridgelabz.functional;

import java.util.Scanner;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Toss the coin:");
		number=scanner.nextInt();
		do
		{
			if(number==0)
			{
				System.out.println("Head");
			}
			else if(number>1)
			{
				System.out.println("tail");
			}
		}
		
	    while(Math.random()<0.5);
		}
}
