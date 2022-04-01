package com.day3;

public class ReverseNumInArray {
//Java Program to print the elements of an array in reverse order
	public static void main(String[] args) {
		int [] array = new int [] {343, 567, 432, 436, 876};	//initialise array
		System.out.println("Element of array");
		for (int i = array.length - 1; i >= 0; i--) {  //run until i become 0
			System.out.println(array[i]);              //reverse element
	}

}
}
