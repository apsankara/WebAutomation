package sDETInterviewQuestion;

public class Fibinacciserios {

	public static void main(String[] args) {
			
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=10;i++) {
			
			sum=n1+n2;//0+1=1, 1+1=2,1+2=3,2+3=5
			System.out.print(" "+sum);//1,2,3,5
			n1=n2;//3
			n2=sum;//5
		}
		
		

	//Fibonacci 0+1+1+2+3+5+8

	int num1=0;
	int num2=1;

	int sum1=0;

	int fibonacci=5;
	System.out.print(num1+" "+num2);
	for(int j=2;j<fibonacci;j++)
	{
	 sum1=num1+num2;
	 System.out.print(" "+sum1);
	num1=num2;
	num2=sum1;
	}

	
	}
}
