package com.day5;
import java.util.Scanner;
import com.util.Util;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numrs : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		Util checkLargestNum = new Util();
		checkLargestNum.largestNum(num1, num2, num3);
	}
}
