package javaforinterviewquestions;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int givennumber=0;
		int reversenumber=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Numer");
		
		givennumber=scan.nextInt();
		
		scan.close();
		while(givennumber!=0) {
		reversenumber=reversenumber*10;
		reversenumber=reversenumber+givennumber%10;
		givennumber=givennumber/10;
		
		}
		
		System.out.println(reversenumber);
		
		
		
	}

}
