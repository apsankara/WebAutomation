package javaforinterviewquestions;

public class FindVowelsinName {

	public static void main(String[] args) {
		
		String name="Sankaralingam";
		
		int vowelscount=0;
		
		name=name.toLowerCase();
		
		int length=name.length();
		
		for(int i=0;i<length;i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			vowelscount++;
		}
		System.out.println(vowelscount);
	}
}
