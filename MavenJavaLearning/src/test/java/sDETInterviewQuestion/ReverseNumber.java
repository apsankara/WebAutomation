package sDETInterviewQuestion;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		Scanner scaninput=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int number=scaninput.nextInt();
		
		System.out.println(number);
		
		//1.Using algoritham
		/*int revnumber=0;
		
		while(number!=0) {
			
			revnumber=revnumber*10 + number%10;
			number=number/10;
		}
		System.out.println("Reverse Number is " +revnumber);*/
		
		//Using StringBuffer
		
		StringBuffer buffer=new StringBuffer(String.valueOf(number));
		StringBuffer rev=buffer.reverse();
		System.out.println("Revers Number is " +rev);
		
		
		StringBuilder builder=new StringBuilder();	
		builder.append(number);
		StringBuilder rev1=builder.reverse();
		System.out.println("Revers Number is " +rev1);
		
		
	}

}
