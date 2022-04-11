package com.bridgeLabz_day6;
import java.util.Scanner;
/* Program for reverse numrs
 * We need to calculate the remainder of the number using the modulo
 * After that, we need to multiply the variable reverse by 10 and add the remainder into
 * We then divide the number by 10 and repeat steps until the number becomes 0.
 * 
 * @ Dnyandeo Bansode
 * */
public class ReverseNum {
	public static void reverseNum(int num) {
	    int reversed = 0;
	    while(num != 0) {
	    int digit = num % 10;
	    reversed = reversed * 10 + digit;
	    num /= 10;
	    }
	    System.out.println("Reversed num is " + reversed);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :- ");
		int num = sc.nextInt();
		reverseNum(num);
	}

}
