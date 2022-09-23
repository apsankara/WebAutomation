package practice;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		// access all elements using for each loop
		   // add each element in sum
		   for (int number: numbers) {
		     sum += number;
		     System.out.println(sum);
		     
		   }
		  
		   // get the total number of elements
		   int arrayLength = numbers.length;
		   System.out.println(arrayLength);
		   
		// calculate the average
		   average =(double) (sum/arrayLength);
		   System.out.println(average);

	}

}
