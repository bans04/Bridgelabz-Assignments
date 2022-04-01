package com.day3;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int [] array = new int[] {432, 56, 787, 54, 89};
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] < min) {
					min = array[i];
				}
			}
		}System.out.println(min);
	}
}
