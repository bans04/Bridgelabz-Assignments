package com.day5;
import java.util.Scanner;
import com.util.Util;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num U want to check : ");
		int num = sc.nextInt();
		Util check = new Util();
		check.oddOrEven(num);

	}

}
