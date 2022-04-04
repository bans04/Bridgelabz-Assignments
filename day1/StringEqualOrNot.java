package com.day1;
import java.util.Scanner;

public class StringEqualOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 			//object of class scanner
		System.out.println("Enter a first string:");
		String str1 = sc.nextLine(); 					//take string as input for user
		System.out.println("Enter seconde String:");
		String str2 = sc.nextLine();					 //take string as input from user
		
		if (str1.equals(str2)) { 						//logic for compairing str1 & str2 , if logic true execute if statment otherwise else
			System.out.println("str1 & str is equal");
		} else {
			System.out.println("str1 & str2 is not equal");
	 }
   }
}
