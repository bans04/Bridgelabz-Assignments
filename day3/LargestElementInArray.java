package com.day3;

public class LargestElementInArray {

	public static void main(String[] args) {
		System.out.println("Largest element in array :- ");
		int [] array = new int [] {23, 567, 1767, 43, 76, 2345, 987};
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}
