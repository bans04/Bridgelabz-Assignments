package com.day5;

import java.util.Scanner;

import com.util.Util;

public class OvelsOrConsonent {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		Util.checkAlphabet(ch);
	}

}
