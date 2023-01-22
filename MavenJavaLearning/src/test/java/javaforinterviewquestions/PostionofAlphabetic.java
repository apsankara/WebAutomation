package javaforinterviewquestions;

import java.util.Scanner;

public class PostionofAlphabetic {

	public static void main(String[] args) {
		
		// ascii value for 97-->a,65-->A
		//https://www.youtube.com/watch?v=JQDKOd1-Xd0&list=PLLS0D9-W-1dmoSD9D-h0LxLSytAgyGDSB&index=9
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Char");
		
		char charval=scan.next().charAt(0);
		scan.close();
		char val=Character.toLowerCase(charval);
		
		int asciival=(int)val;
		int position=asciival-96;
		System.out.println(position);
		
	}

}
