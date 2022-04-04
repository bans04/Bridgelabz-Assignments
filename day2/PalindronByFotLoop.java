package com.day2;

import java.util.Scanner;

public class PalindronByFotLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				 //object of scanner class
		System.out.println("Enter a Original number : ");
		int num = sc.nextInt();									//take num as input

	    int reversed = 0;										//it run until condition false
		for(;num != 0; num /= 10) { 							//use for loop to do reverse operation
	      int digit = num % 10;									//it gives reminder means last digit
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);    //reversed num
	    
	    if(reversed == num) {    								//reversed num = original num , that time if condition execute otherwise else
	    	System.out.println("Given num is palindron");
	    } else {
	    	System.out.println("Given num is not palindron");
	    }

	}

}
