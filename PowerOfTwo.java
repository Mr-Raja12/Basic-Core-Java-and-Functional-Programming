package com.bl.corejavaprogram;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		 int exponent =0;
		 int i=0;
		 
		 System.out.println("Enter the value of Exponent : ");
		 Scanner Exponent=new Scanner(System.in);
		 exponent=Exponent.nextInt();
		 
		 if(exponent>=0)
		 {
			 if(exponent<31)
			 {
				 System.out.println("Displaying Power of 2...");
				 for (i=0;i<=exponent;i++)
					 System.out.println("2^"+ i +" = "+ (int)(Math.pow(2,i)));
			 }
			 else
				 System.out.println("Kindly enter the exponential value less than 31");
			 
			 }
		 else
			 System.out.println("Enter a positive exponent vaues");
	}
}


