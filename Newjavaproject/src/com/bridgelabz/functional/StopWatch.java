package com.bridgelabz.functional;

import java.util.concurrent.TimeUnit;

import com.bridgelabz.utility.Utility;

public class StopWatch 
{

	public static void main(String[] args) throws InterruptedException 
	{   
		
		int n=2;
		long start=System.currentTimeMillis();
		for(int i=0;i<=n;i++)
		{
			TimeUnit.SECONDS.sleep(2); //duration between start and stop watch
		}
		long stop=System.currentTimeMillis();
	    long elapsedTime=stop-start;
		System.out.println("Elapsed time of stopwatch:"+elapsedTime);
		Utility.StopWatch(n);
		}
	

}
