package sDETInterviewQuestion;

public class ReverseIntegerStringBuffer {
	
	public static void main(String[] args)
	{
		int name=12345;
		
		StringBuffer sb=new StringBuffer(String.valueOf(name));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
		//StringBuilder
		StringBuilder builder=new StringBuilder();
		
		builder.append(name);
		
		System.out.println(builder.reverse());
		
	}

}
