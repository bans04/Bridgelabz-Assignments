package com.day2;

import java.util.Scanner;

public class ReverseNumberByForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);           //object of scanner class
		System.out.println("Enter a Original number : ");
		int num = sc.nextInt();							//take num as input that user want to check

	    int reversed = 0;
		for(;num != 0; num /= 10) {
	      int digit = num % 10;							//it gives reminder and add to reverse
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed); //output
	}

}
