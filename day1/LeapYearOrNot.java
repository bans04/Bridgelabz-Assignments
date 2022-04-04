package com.day1;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		  System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);		//object of scanner class
	      int year = sc.nextInt(); 					//Enter a year you want to check , leap year or not

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 	//logic to check year is palindron or not
	         System.out.println("year is a leap year");						//output if all condition is true
	      else
	         System.out.println("year is not a leap year");					//other wise execute else statement
	}

}
