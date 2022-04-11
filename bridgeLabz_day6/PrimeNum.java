package com.bridgeLabz_day6;
import java.util.Scanner;
/* program for prime numrs
 * When the number is divided greater than 1 and
 *  divided by 1 or itself is referred to as the Prime number.
 *  
 *  @ Dnyandeo Bansode
 *  */
public class PrimeNum {
	public static boolean primeNum(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime num.");
				return false;
			}
		}System.out.println(num + " is a prime num.");
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		primeNum(num);
	}

}
