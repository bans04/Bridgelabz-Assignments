package com.day1;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//object of scanner class
		System.out.println("Enter First num.:");
		int firstNumber = sc.nextInt(); 				//take first num as input
		System.out.println("Enter Seconde num.:");
		int secondeNumber = sc.nextInt();				//take seconde num as input
		
		int sum = (firstNumber + secondeNumber);		//Addition of first num & seconde num & store in sum
		System.out.println("Addition of firstNumber & SecondeNumber =" + " " + sum);	//output
	}

}
