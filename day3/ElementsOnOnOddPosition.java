package com.day3;

public class ElementsOnOnOddPosition {

	public static void main(String[] args) {
		System.out.println("Elements on odd position in Array :- ");
		int [] array = new int [] {23, 56, 87, 78, 45};    				//Initialize array  
		for(int i = 0; i < array.length; i = i + 2) {					//incrementing value of i by 2  
			System.out.println("num on even position : " + array[i]);   //output on even position
		}

	}

}
