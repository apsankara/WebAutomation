package sDETInterviewQuestion;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String name=scan.next();
		
		String org_name=name;
		
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		
		if(org_name.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		
		
	}

}
