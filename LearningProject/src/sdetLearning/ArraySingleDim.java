package sdetLearning;

public class ArraySingleDim {

	public static void main(String[] args) {
		
		int a[]=new int [5];
		
		a[0]=100;
		a[1]=200;
		
		System.out.println(a[1]);
		
		int b[]= {100,200,300,400};
		
		System.out.println(b[2]);
		
		for(int i=0;i<=b.length-1;i++) 
		{
			System.out.println(b[i]);
		}
		
	}

}
