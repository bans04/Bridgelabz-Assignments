package com.day3;

public class ElementPresentOnEvenPositio {
//Java Program to print the elements of an array present on an even position
	
	public static void main(String[] args) {
		int [] array = new int [] {23, 56, 87, 78, 45};    				//Initialize array  
		for(int i = 0; i < array.length; i = i + 2) {					//incrementing value of i by 2  
			System.out.println("num on even position : " + array[i]);   //output on even position
		}

	}

}
 	 