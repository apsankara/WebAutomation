package sDETInterviewQuestion;

public class ReverseStringCharAt {

	public static void main(String[] args) {
		String name="ABCD";

		String reverse="";

		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
