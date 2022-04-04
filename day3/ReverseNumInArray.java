package com.day3;

public class ReverseNumInArray {

	public static void main(String[] args) {
		int [] array = new int [] {343, 567, 432, 436, 876};	//initialise array
		System.out.println("Reverse Element of array :- ");
		for (int i = array.length - 1; i >= 0; i--) {  //run until i become 0
			System.out.println(array[i]);              //reverse element
	}
	}
}
