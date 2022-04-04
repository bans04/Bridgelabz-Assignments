package com.day2;
import java.util.Scanner;

public class SumByWhileLoop {                   
//Program for the sum of n natural numbers by using while loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//object of scanner class
		System.out.println("Enter a num :");
		int num1 = sc.nextInt();				//take input from user
		int i = 0, sum = 0;
		while(i <= num1) {						//run loop until condition become false
			sum = sum + i;						//adding value if i into sum
			i = i + 1;							//icrement value of i by 1 in each interation
		}
		System.out.println("Sum of number from 0 to" + " " + num1 + ": " + sum);	//addition of n natural num
	}

}
