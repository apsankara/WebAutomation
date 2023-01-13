package sDETInterviewQuestion;

public class SwapTwoNO {

	public static void main(String[] args) {
		int a=10,b=20;
		
		
		System.out.println("Before Swap A " +a);
		System.out.println("Before Swap B " +b);
		
		//Using the Third Variable
		/*int c=0;
		
		c=a;//10
		a=b;//20
		b=c;//10*/
		
		//Without third variable
		/*a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20*/
		
		//Using the divided
		
		/*a=a*b;//200
		b=a/b;//200/20=10
		a=a/b;//200/10=20*/
		
		//single statement 
		
		b=a+b-(a=b);
		
		System.out.println("After Swap A " +a);
		System.out.println("After Swap B " +b);
		
		
	}

}
