package sdetLearning;

public class OperatorsExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//Arithmetic operator
		System.out.println("Sum of a and b="+(a+b));
		System.out.println("Div of a and b="+(a-b));
		System.out.println("Multiple of a and b="+(a*b));
		System.out.println("Divident of a and b="+(a/b));
		System.out.println("Module of a and b="+(a%b));
		
		
		//relational and comparison operator
		//always return boolean value
		
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		
		//Logical Operator && || 
		//works between two boolean
		boolean x=true;
		boolean y=false;
		System.out.println(x||y);//true
		System.out.println(!x);//false
		
		
		
	}

}
