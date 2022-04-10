package com.day5;

import java.util.Scanner;

import com.util.Util;

public class HarmonicNo {

	public static void main(String[] args) {
		System.out.print("Enter Nth Harmonic no : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Util.harmonicNo(num);

	}

}
