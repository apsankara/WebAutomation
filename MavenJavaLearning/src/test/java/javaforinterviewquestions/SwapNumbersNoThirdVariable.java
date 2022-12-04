package javaforinterviewquestions;

public class SwapNumbersNoThirdVariable {

	public static void main(String[] args) {
			
		int first=10;
		int second=20;
		
		System.out.println("Before Swapping no "+"First "+first+" Second "+second);
		
		/*first=first-second;//10-20=-10
		second=first+second;//-10+20=10
		first=second-first;//10--10=20*/
		
		System.out.println("After Swapping no arithmetic "+"First "+first+" Second "+second);
		
		first=first*second;//10*20=200;
		second=first/second;//200/20=10;
		first=first/second;//200/10=20;
		
		
		System.out.println("After Swapping no arithmetic "+"First "+first+" Second "+second);
	}

}
