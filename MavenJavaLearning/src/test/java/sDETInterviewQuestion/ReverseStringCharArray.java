package sDETInterviewQuestion;

public class ReverseStringCharArray {

	public static void main(String[] args) {
		String name="ABCD";

		String reverse="";

		//Reverse the String Using the CharArray
		char charArray[]=name.toCharArray();

		for(int i=charArray.length-1;i>=0;i--)
		{
			reverse=reverse+charArray[i];	
			
		}
		System.out.println(reverse);
	
	}
	
	

}
