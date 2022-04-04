package com.day1;
import java.util.Scanner;

public class GetNameByCommandLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 			//object of scanner class
		System.out.println("Enter your name:"); 
		String str = sc.nextLine(); 					//take a int as input from user
		
		System.out.println("Your name is : " + str); //print the taken input as output
	}

}
