package javaforinterviewquestions;

import java.util.Arrays;

public class SeparateNonZerosandZeros {

	public static void main(String[] args) {
		
		int[] myArray={0,1,0,8,0,9,0,4,0,7};
		
		int size=myArray.length;
		//System.out.println(length);
		int pos=0;
		for(int i=0;i<size;i++) {
			if(myArray[i]!=0) {
				myArray[pos]=myArray[i];
				pos++;
			}
				
		}
		while(pos<myArray.length) {
			myArray[pos]=0;
			pos++;
		}
		
		String finalval=Arrays.toString(myArray);
		System.out.println(finalval);
	}

}
