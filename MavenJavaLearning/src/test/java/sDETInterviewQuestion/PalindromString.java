package sDETInterviewQuestion;

public class PalindromString {

	public static void main(String[] args) {
		
		String name="Sankaralingam";
		
		String reverse="";
		
		String org_name=reverse;

		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			
		}
		
		if(org_name.equals(reverse)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		
		
	}

}
