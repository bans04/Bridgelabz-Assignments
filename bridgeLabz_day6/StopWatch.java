package com.bridgeLabz_day6;
import java.util.Scanner;
/* Stopwatch Program for measuring the time that elapses between
 * the start and end clicks
 * I/P -> Start the Stopwatch and End the Stopwatch
 * Logic -> Measure the elapsed time between start and end
 * O/P -> Print the elapsed time.
 * 
 * @ Dnyandeo Bansode
 * 
 * */
public class StopWatch {
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}

	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		System.out.println("Press any num to Start Time: ");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		sw.start();

		System.out.println();
		System.out.println("Press any num to Stop Time: ");
		int u1 = sc.nextInt();
		sw.stop();

		long l=sw.getTime();
		System.out.println();
		System.out.println("Total Time (in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

	}

}
