package com.day2;

import java.util.Scanner;

public class SumByForLoop {
//Program for the sum of n natural numbers by using for loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//object of scanner claass
		System.out.println("Enter a num : ");
		int num = sc.nextInt();							//take input from user
		int sum = 0;
		for(int i = 0; i <= num; i++ ) { 				//execute  for loop untio condition become false
			sum = sum + i;								//adding i value into sum
		}
		System.out.println("Sum of numbers from 0 to " + num + " = "  + sum);	//output addition of n natural num
	}

}
