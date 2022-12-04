package javaforinterviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Agni";
		
		char[] reversechararray=name.toCharArray();
		
		String reverse="";
		
		for(int i=reversechararray.length-1;i>=0;i--) 
		{
			reverse=reverse+reversechararray[i];
		}
		
		System.out.println(reverse);
	}

}
