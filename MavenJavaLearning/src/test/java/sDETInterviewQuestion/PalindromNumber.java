package sDETInterviewQuestion;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num=scan.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
			
		}		
		//System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("Not Palindrom Number");
		}
		}
}
