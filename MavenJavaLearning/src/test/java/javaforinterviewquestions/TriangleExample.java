package javaforinterviewquestions;

import java.util.Scanner;

public class TriangleExample {

	public static void main(String[] args) {
		//Print the Triangle with given number for *
		Scanner scannerinput=new Scanner(System.in);

		System.out.println("Enetr the Triangle Number");

		int number=scannerinput.nextInt();

		int row,column=0;

		for(row=0;row<number;row++)
		{

			for(column=0;column<=row;column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}

	}

}
