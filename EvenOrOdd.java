package com.bl.corejavaprogram;

import java.util.Scanner;

public class EvenOrOdd {
	
	 public static void main(String[] args) {
	        int number;
	        //checking whether the number is even or odd
	        Scanner Number= new Scanner(System.in);
	        System.out.println("Enter a Number ");
	        number=Number.nextInt();
	        if (number % 2 == 0)
	            System.out.println(number + " is Even");
	        else
	            System.out.println(number + " is odd");
     }
}
