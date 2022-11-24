package com.bl.corejavaprogram;

import java.util.Scanner;

public class FlipCoin {
      public static void main(String[] args) {
		
    	  int Heads=0;
    	  int Tails =0;
    	  double HeadPercent=0;
    	  double TailsPercent=0;
    	  int n=0;
    	  int i=0;
    	  double flip =0;  
    	  System.out.println("Enter the Number of flip of your choice : ");
    	  Scanner PositiveInteger= new Scanner(System.in);
    	  n = PositiveInteger.nextInt();
    	  
    	  if (n<=0)
    		  System.err.println("Enter a Positive Integer");
    	  else
    	  {
    		  for (i=0;i<n;i++)
    		  {
    			  flip = Math.random();
    			  if(flip<0.5)
    			  {
    				  Tails++;
    				  System.out.println("TAILS");
    			  }
    			  else
    			  {
    				  Heads++;
    				  System.out.println("HEADS");
    			  }
    			  System.out.println(flip);
    		  }
    		  System.out.println();
    		  System.out.println("HEAD "+ Heads + " Times. ");
    		  System.out.println("TAILS "+ Tails + " Times. ");
    		  HeadPercent = (Heads*100)/n;
              TailsPercent =(Tails*100)/n;
              System.out.println("HEADS : " +HeadPercent + "%");
              System.out.println("Tails : " +TailsPercent + "%");

    	  }  
	}
}
