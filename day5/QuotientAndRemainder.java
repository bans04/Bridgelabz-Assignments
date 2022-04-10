package com.day5;

import java.util.Scanner;

import com.util.Util;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend number: ");
		int dividend = sc.nextInt();
		System.out.print("Enter divisior number: ");
		int divisor = sc.nextInt();

		int quotient = Util.quotient(dividend, divisor);
		int remainder = Util.remainder(dividend, divisor);

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

	}

