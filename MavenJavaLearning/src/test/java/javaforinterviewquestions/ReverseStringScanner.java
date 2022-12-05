package javaforinterviewquestions;

import java.util.Scanner;

public class ReverseStringScanner {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String name=scan.nextLine();
		
		System.out.println(name);
		
		char[] array=name.toCharArray();
		
		String reverse="";
		
		for(int i=array.length-1;i>=0;i--) {
			reverse=reverse+array[i];			
			//System.out.println(i);
			//System.out.println(reverse);
		}
		System.out.println(reverse);
	}

}
