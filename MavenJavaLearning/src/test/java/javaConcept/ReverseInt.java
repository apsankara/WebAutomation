package javaConcept;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Integer");
		
		int num=scan.nextInt();
		
		//using StringBuffer
		//StringBuffer rev;
		//StringBuffer buff=new StringBuffer(String.valueOf(num));
		
		//rev=buff.reverse();
		
		//Using StringBuilder
		
		StringBuilder builder=new StringBuilder();
		
		builder.append(num);
		StringBuilder rev=builder.reverse();
		
		
		System.out.print("Reverse of the integer " +rev);
		
		
		
		
		
	}

}
