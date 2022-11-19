package sdetLearning;

import java.util.Scanner;

public class OddorEvenNumber {

	public static void main(String[] args) {
			
		
		//int num=5;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number: ");  
		
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("This Even Number: "+num);
		}
		else
		{
			System.out.println("This odd Number: "+num);
		}
	}

}
