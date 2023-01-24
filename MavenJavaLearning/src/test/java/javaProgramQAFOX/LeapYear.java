package javaProgramQAFOX;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		
		scan.close();
		
		boolean isLeapYear=false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				isLeapYear=false;
			}
			else {
				isLeapYear=true;
			}
		}
		else
		{
			isLeapYear=false;
		}
		
		if(isLeapYear)
		{
			System.out.println(year +" is leap Year");
		}else {
			System.out.println(year +" is not Leap Year");
		}

	}

}
