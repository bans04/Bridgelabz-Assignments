package com.bridgeLabz_day6;
import java.util.Scanner;
/*  Program for Find the Fewest Notes to be returned for Vending Machine
 * here is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be 
 * returned by Vending Machine.
 *
 * @ Dnyandeo Bansode
 * 
 * */
public class VendingMachine {
  	static int i=0;
  	static int total=0;
  	//Initialization of New Array
  	static int[] notes = { 1000,500,100,50,10,5,2,1};
  	static int money;
  	// Function for Calculating the notes
  	public static  int calculate(int money,int[]notes )
  	{
  		//calling calculate Function
        int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				// logic for Calculating The notes
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount:");
		money =sc.nextInt();
		// Creating The Object of Vending MAchine class
		VendingMachine.calculate(money,notes);
		System.out.println("Total Number of Notes are :"+total);
	}

	}

