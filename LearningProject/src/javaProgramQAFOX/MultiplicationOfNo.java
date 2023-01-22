package javaProgramQAFOX;

import java.util.Scanner;

public class MultiplicationOfNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the No");
		int number=scan.nextInt();
		scan.close();		
		for(int i=1;i<=100;i++)
		{
			System.out.println(+i+"x"+number+"="+(i*number));
		}

	}

}
