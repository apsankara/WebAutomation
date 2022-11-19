package sdetLearning;

public class ArrayPrintEvenandOdd {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		//for Even nos
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("\n");
			System.out.print(a[i]);
			}
			
		}
		
		//for odd no
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("\n");
			System.out.print(a[i]);
			}
			
		}
		
		
	}

}
