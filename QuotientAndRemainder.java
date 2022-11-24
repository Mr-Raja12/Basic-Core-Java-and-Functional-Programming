package com.bl.corejavaprogram;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		
		System.out.println("Enter dividend : ");
		Scanner Number = new Scanner(System.in);
		int dividend = Number.nextInt();
		System.out.println("Enter divisor : ");
		int divisor = Number.nextInt();
		Number.close();
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);
	}
}
