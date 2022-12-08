package javaforinterviewquestions;

public class StringCountExample {
	
	String str="Sankaralingam";
	
	public void string() {
		System.out.println(str.length());
	}
	
	public void charArray() {
		int size=0;
		char[] chararray=str.toCharArray();
		for (char c : chararray) {
			size++;
		}
		System.out.println(size);
		
	}
	
	public static void main(String[] args) {
		
		StringCountExample count=new StringCountExample();
		count.string();
		count.charArray();
		
	}

}
