package sdetLearning;

import java.util.Scanner;

public class Positivenegativeexample {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the No");
		int no=scan.nextInt();
		float result;
		/*if(no>=0)
		{
			System.out.println("Positive no");
		}
		else
		{
			System.out.println("Negative No");
		}*/
		result=Math.signum(no); 
		System.out.println(result);	
	}

}
