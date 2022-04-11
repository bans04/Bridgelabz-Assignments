package com.util;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Util {
	private static Scanner scanner;

	//this method for leap year
	public void leapYear(int year){
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			System.out.println("year is a leap year");
		}
		else {
			System.out.println("year is not a leap year");
		}
			}
	//this methode for coin flip
	public void flip(int noOfTimes) {
		int heads_cnt = 0, tails_cnt = 0;
		double heads, tails;
		for (int j = 0; j < noOfTimes; j++) {
			double random = Math.random();
			if (random < 0.5) {
				tails_cnt++;
			}else {
				heads_cnt++;
			}
		}
		System.out.println("No of times tail comes : " + tails_cnt++);
		System.out.println("No of times head comes : " + heads_cnt++);
		heads = heads_cnt / (double) noOfTimes * 100;
		tails = tails_cnt / (double) noOfTimes * 100;
		System.out.println("Percentage of heads: " + tails + "%");
		System.out.println("Percentage of tails: " + heads + "%");
		}
	
	//this methode for Harmonic no
	
	public static void harmonicNo(int num) {
		double sum = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				double harmonicNo = Double.valueOf(i);
				sum = sum + (1 / harmonicNo);
			}
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("");
		System.out.println("Harmonic value : " + sum);
	}
	
	//This method for num is odd or even
	
	public static void oddOrEven(int num) {
		if (num % 2 == 0) {
			System.out.println("Given num is Even num");
		}
		else {
			System.out.println("Given num is odd num");
		}
	}
	
	//this method for find largest num in 3 numrs
	
	public static void largestNum(int num1, int num2, int num3) {
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("The largest num is : " + num1);
		}else
		if((num2 > num1) && (num2 > num3)) {
			System.out.println("the largest num is : " + num2);
		}
		else {
			System.out.println("the largest num is : " +  num3);
		}
	}
	
	//this method is find out questient and reminder
	
	public static int quotient(int dividend, int divisor) {
		int quotient = dividend / divisor;
		return quotient;
	}
	
	public static int remainder(int dividend, int divisor) {
		int remainder = dividend % divisor;
		return remainder;
	}
	
	//this mehode for swapping two numrs
	
	public static void swapNo(int num1, int num2) {
		System.out.println("Before swapping numbers: ");
		System.out.println("No 1 position : " + num1 + "  " + "No 2 position : " + num2);
		System.out.println();

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping: ");
		System.out.println("No 1 position : " + num1 + "   " + "No 2 position : " + num2);
	}
	
	//this method for decide whether it is ovels or consenent
	
	public static void checkAlphabet(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a Vowel ");
		} else {
			System.out.println(ch + " is Consonant");
		}}
	public static double distance(double x, double y) {
		double distance;
		return distance = Math.sqrt(Math.pow(x, x)) + (Math.pow(y, y));
		
}
	
	//this method is for finf out the root of quadratic equations
	public static void quadratic(int a, int b, int c) {
		double determinant = (double) Math.pow(b, b) - 4 * a * c;
		System.out.println("Determinant : " + determinant);

		// check if determinant is greater than 0 then two real and different roots
		double root_1, root_2;
		if (determinant > 0) {
			root_1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root_2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("Root 1 =" + root_1 + "   " + "Root 2 =" + root_2);
		}

		// check if determinant is equal to 0
		else if (determinant == 0) {

			// determinant is equal to 0 .. two real and equal roots
			root_1 = root_2 = -b / (2 * a);
			System.out.println("Root 1 = " + root_1 + "   " + "Root 2 = " + root_2);
		} else // determinant < 0 ..roots are complex no
			System.out.println("Roots are complex no");
}
	
	public static double effectiveTemp(int temparature, double speed) {
		double temparature1 = (temparature * 18) + 32;

		double milesPerHour = (speed / 1.609344);

		double EffectiveTemperature = 35.74 + (0.6215 * temparature)
				+ (0.4275 * temparature - 35.75) * Math.pow(milesPerHour, (int) 0.16);

		return EffectiveTemperature;
	}

	
}

