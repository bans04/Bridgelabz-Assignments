package com.bridgeLabz_day6;
import java.util.Scanner;
/*Program for perfect numrs
 * When the number is equal to the sum of its positive divisors
 * excluding the number, it is called a Perfect Number.
 * The divisors of 28 are 1, 2, 4, 7, and 14. So,
 * 28 = 1+2+4+7
 * 28 = 28
 * 
 * @ Dnyandeo Bansode
 * 
 */
public class PerfectNum {
	public static void perfectNum(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}System.out.println(sum);
		if(sum == num) {
			System.out.println( num + " is Perfect num.");
		}
		else {
			System.out.println( num + " is not Perfect num.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numr you want to check :- ");
		int num = sc.nextInt();
		perfectNum(num);
	}

}
