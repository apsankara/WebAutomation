package javaforinterviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySmallestNumber {

	Integer givenArray[]= {2,1,3,5,4};
	
	public void smallestnumber() {
		
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<givenArray.length;i++) 
		{
			if(givenArray[i]<smallest)
			{
				smallest=givenArray[i];
			}
			
		}
		System.out.println("Smalaste number="+smallest);
	}
	
	//using array
	public void usingArray() {
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public static void main(String[] args) {
		
		ArraySmallestNumber small=new ArraySmallestNumber();
		small.smallestnumber();
		small.usingArray();
		small.collections();
		
	}
	
	public void collections() {
		
		List<Integer> list =Arrays.asList(givenArray);
		Collections.sort(list);
		
		int smallest=list.get(0);
		System.out.println(smallest);
	}

}
