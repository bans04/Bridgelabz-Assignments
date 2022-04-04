package com.day3;

public class ElementInArray {

	public static void main(String[] args) {
		System.out.println("Elements in Array :- ");
		int [] array = new int [] {45, 78, 0, 32, 456, 321};  //Initialies arra
		System.out.println("Elements in array : ");
		for(int i = 0; i < array.length; i++) {   				//for loop logic to print element in array
			System.out.println(array[i]);
		}
	}
}
