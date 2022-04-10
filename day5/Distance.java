package com.day5;
import java.util.Scanner;
import com.util.Util;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x point : ");
		double x = sc.nextInt();
		System.out.print("Enter y point : ");
		double y = sc.nextInt();

		double distance = Util.distance(x, y);
		System.out.println("Euclidean distance from the point (" + x + "," + y + ") to the origin (0, 0) : " + distance);

	}

}
