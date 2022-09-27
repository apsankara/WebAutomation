package program;

public class SwapingTwoNo {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		System.out.println("Before swaping of no " +a +" "+b);
		
		/*
		 * //logic1 int t=a;//20 a=b;//a=10 b=t;//b=20
		 * System.out.println("After swaping of no " +a +" "+b);
		 */
	/*a=a+b;//30
	b=a-b;//20
	a=a-b;//10
	System.out.println("After swaping of no " +a +" "+b);*/
		
		/*a=a*b;//200
		b=a/b;//200/10=20
		a=a/b;//200/20=10
		System.out.println("After swaping of no " +a +" "+b);*/
	//a=20 b=10;
		
	b=a+b-(a=b);
	System.out.println("After swaping of no " +a +" "+b);
	}

}
