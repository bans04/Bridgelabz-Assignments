package com.day5;
import java.util.Scanner;
import com.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year U want to check : ");
		int year = sc.nextInt();
		Util leap = new Util();
		leap.leapYear(year);
		}
	}

