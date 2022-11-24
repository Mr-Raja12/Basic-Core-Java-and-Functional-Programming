package com.bl.corejavaprogram;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter tow number");
        Scanner Number=new Scanner(System.in);
        x=Number.nextInt();
        y=Number.nextInt();
        System.out.println("Before Swapping "+ x+" "+y);
        x = x+y;//100+200=300
        y = x-y;//300-200=100
        x = x-y;//300-100=200
        System.out.println("After Swapping "+ x+" "+y);
    }
}

