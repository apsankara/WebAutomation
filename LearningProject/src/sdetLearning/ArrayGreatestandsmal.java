package sdetLearning;

public class ArrayGreatestandsmal {

	public static void main(String[] args) {
		
			int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		
		//assign first element of an array to largest and smallest
		  int smallest = numbers[0];
		  int largetst = numbers[0];
		  
		  for (int i = 1; i < numbers.length; i++) {
			   if (numbers[i] > largetst)
			    largetst = numbers[i];
			   else if (numbers[i] < smallest)
			    smallest = numbers[i];
			  }

			  System.out.println("Largest Number is : " + largetst);
			  System.out.println("Smallest Number is : " + smallest);
		
	}

}
