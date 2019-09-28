package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Utility {
	public static Scanner scanner=new Scanner(System.in);
	
		public static int getInteger()
		{
			return  scanner.nextInt();
	}
	/**
	 * @param number
	 */
	/*program for prime number*/
	
public static void primeFactor(int number)
{
		for(int i=2;i<=number;i++)
	    {
	    	while(number%i==0)// number is 0 or not 
	    	{
	    		number=number/i;
	    		System.out.println(+i);
	    	}
	    	if(number<1)
	    	System.out.println(+number);
	    }
	}
	
	
/*program for power of number*/
	
public static void PowerOf(int number,int i) 
{
		
	while(i<=number)
	{
		System.out.println("the power of 2^"+Math.pow(2, i));//math.pow()method used for power of the number and return double value
		i++;
	}

}
	
/* program for string name*/
public static void StringName(String Username,int length)
{
		
	if(length>=3)  //fetch length of the string
	{
		System.out.println("Hello"+" "+Username+",How are you?");
		
	}
	else
	{
		System.out.println("Invalid name");
	}
		
}

/*program to print harmonic series*/

public static void HarmonicNumber(float value,int number)
{
	while(number>0)
	{
		value=value+(float)1/number; //Add the value eg.(1+1/2)
		System.out.print(value+" ");
		number--;
	}
}

/* program the year is leap year or not*/

public static void LeapYear(int year,boolean flag)
{
if(year%4==0)  // for check it is leap year or not
{
	if(year%100==0)  //for check it is ordinary year 
	{
		if(year%400==0)
		{
			flag=true; // if it is leap year
			
		}
		else
			flag=false;//not leap year
	}
	else
		flag=true;
}
else
	flag=false;
if(flag)
	System.out.println(year+" "+"is a leap year");
else
	System.out.println(year+" "+"is not a leap year");
}


/*program for Euclidean distance from point (x,y)*/
public static void EuclideanDistance(int x,int y,double sum1,double sum2,double distance)
{
	sum1=Math.pow(x, 2); //power of x
	sum2=Math.pow(y, 2); //power of y
	distance=sum1+sum2; 
	System.out.println("Euclidean distance from("+x+","+y+")to(0,0)="+Math.sqrt(distance));
}

/* program for quadratic eduation find the value of x*/
public static void QuadraticEquation(int a,int b,int c,double Root1,double Root2,double delta)
{
	delta=Math.sqrt(b*b-4*a*c);
	Root1=(-b+delta/(2*a));
	Root2=(-b-delta/(2*a));
	System.out.println("The roots of x is:  a*x*x+b*x+c:" +Root1+"and"+Root2);
}

/*program for windchill*/
public static void WindChill(double temperature,double speed,double windchill)
{
	speed=Math.pow(speed, 0.16); //find power of the speed value (v^0.16 let,v=speed) 
    windchill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*speed;
    System.out.println("The effective temperature of the windchill is:"+windchill);
}
/*program for Escaped time in stopwatch*/
public static void StopWatch(int n) throws InterruptedException 
{
	long start=System.currentTimeMillis();
	for(int i=0;i<=n;i++)
	{
		TimeUnit.SECONDS.sleep(2); //duration between start to stop watch
	}
	long stop=System.currentTimeMillis();
    long elapsedTime=stop-start;
}
}
