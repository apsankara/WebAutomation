package javaProgramQAFOX;

import java.util.Scanner;

public class GivenNoEvenOrOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the No");
		int number=scan.nextInt();
		scan.close();
		if(number%2==0)
		{
			System.out.println("Given Number="+number +" is Even");
		}
		else
		{
			System.out.println("Given Number="+number +" is Odd");
		}

	}

}
