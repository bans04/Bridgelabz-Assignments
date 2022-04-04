package com.day2;
import java.util.Scanner;

public class ReverseNumberByWhileLoop {
	// Program to reverse the integer number by using while loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    	//object of scanner class
		System.out.println("Enter a original number:");
		int num = sc.nextInt();			//458			//take num from user that they want to check
														
	    int reversed = 0;
	    while(num != 0) {							// run loop until num becomes 0
	    int digit = num % 10;						// get last digit from num
	    reversed = reversed * 10 + digit;
	    num /= 10;                                  //// remove the last digit from num
	    }

	    System.out.println("Reversed Number: " + reversed);  //output as reversed num
	}
}
