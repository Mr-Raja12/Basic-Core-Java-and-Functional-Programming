package com.bl.corejavaprogram;

public class LeapYear {
		public LeapYear(int year)
		{
			if(((year%4==0)&&(year%100!=0) || (year%4==0)))
			{
				System.out.println(year + " is a Leap Year");
			}
				else
				
					System.out.println(year + "is a not Leap Year");
			
	     }
	public static void main(String[] args) {
		LeapYear year=new LeapYear(2021);
		
	}

}
