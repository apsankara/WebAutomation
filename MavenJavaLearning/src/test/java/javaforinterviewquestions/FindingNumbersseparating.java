package javaforinterviewquestions;

public class FindingNumbersseparating {

	public static void main(String[] args) {
		
		int[] number={0,1,0,8,0,9,0,4,0,7};
		
		//{1,8,9,4,7,0,0,0,0,0}
		//finding the length
		int[] print;
		
		int length=number.length;
		//System.out.println(length);
		
		for(int i=0;i<length;i++) {
			
			if(number[i]!=0) {
				System.out.print(number[i]);
			}
			
		}
		
		
	}

}
