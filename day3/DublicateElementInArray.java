package com.day3;

public class DublicateElementInArray {

	public static void main(String[] args) {
		int [] array = new int [] {23, 56, 78, 56, 23};
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println("Dublicate num in array : " + array[j]);
				}
				
			}
		}

	}

}
