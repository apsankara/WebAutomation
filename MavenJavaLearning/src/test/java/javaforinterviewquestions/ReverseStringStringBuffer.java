package javaforinterviewquestions;

public class ReverseStringStringBuffer {

	public static void main(String[] args) {
		
		String name="Agni";
		
		StringBuffer buffer=new StringBuffer();
		
		buffer.append(name);
		
		StringBuffer str=buffer.reverse();
		System.out.println(str);
	}

}
