package com.bridgelabz.utility;

import java.util.Scanner;

//import com.bridgelabz.datastructure.LinkedList.Node;

public class UtilityD 
{
	public static Scanner scanner=new Scanner(System.in);
	public static String getString()
	{
		return  scanner.next();
	}
	 public static String StringValue() 
	 {
		 String string=scanner.nextLine();
		 return string;
	 }
	public static int IntegerValue() 
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static double DoubleValue()
	{
		double Double=scanner.nextDouble();
		return Double;
	}
	/*for prime number 0-1000*/
	public static boolean primeNumberArray(int number)
	{
		if (number == 0 || number == 1) 
		{
			return false;
		}
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	/*check for prime*/
	public static boolean isPrime(int n)
	{
		
		for(int j=2;j<=n/2;j++) {
			int rem = n % j;
			
			if(rem == 0) {
				return false;
			}
			
		}
		return true;

	}
	
	
	/*prime number for 2D aray*/
	public static int[][] PrimeNumberArray(int n) 
	{
		int [][]prime = new int [10][25];
		int first=0,second=0,third=0,fourth=0;
		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	
		for(int i=2;i<n;i++) 
		{
			
			if(isPrime(i))  //check foo prime
			{
			
			if((i > 0) && (i<= 100))
			prime[0][first++] = i;
	
			else if((i > 100) && (i <= 200))
				prime[1][second++]=i;
			
			else if((i > 200) && (i<= 300)) 
				prime[2][third++] = i;
			
			else if((i> 300) && (i <= 400)) 
				prime[3][fourth++] =i;
			
			else if((i > 400) && (i <= 500)) 
				prime[4][fifth++] = i;
			
			else if((i> 500) && (i <= 600)) 
				prime[5][sixth++] = i;
			
			else if((i>600)&&(i<=700)) 
				prime[6][seventh++]=i;
			
			else if((i> 700) && (i <= 800)) 
				prime[7][eight++] = i;
			
			else if((i> 800) && (i <= 900)) 
				prime[8][nineth++] = i;
			
			else if((i> 900) && (i <= 1000)){	
				prime[9][ten++] = i;
			}
		}
		}
		
		
		return prime;
				
	}}
	

	