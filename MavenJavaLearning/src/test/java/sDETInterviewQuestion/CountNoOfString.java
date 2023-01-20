package sDETInterviewQuestion;

public class CountNoOfString {

	public static void main(String[] args) {
		
		String name="sankaralingam";
		
		int count=name.length();
		
		int counts=0;
		
		System.out.println("String Count=" +count);
		
		for(int i=0;i<count;i++)
		{
			counts++;
		}
		
		System.out.println("String Count="+counts);
	}

}
