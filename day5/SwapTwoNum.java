package com.day5;

import java.util.Scanner;

import com.util.Util;

public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you wish to swap :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Util.swapNo(num1, num2);
	}

	}

