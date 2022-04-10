package com.day5;

import java.util.Scanner;
import com.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.print("enter no. of times you want to flip the coin: ");
		Scanner sc = new Scanner(System.in);
		int noOfTimes = sc.nextInt();
		Util percentage = new Util();
		percentage.flip(noOfTimes);
	}
}