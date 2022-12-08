package javaforinterviewquestions;

public class UpperCasetoLowerCase {

	public static void main(String[] args) {
		String name="SANKARALINGAM";
		
		//CONVERT TO CHAR ARRAY
		
	char[] charArray =name.toCharArray();
	
	for(int i=0;i<charArray.length;i++) {
		if(charArray[i]>=65&&charArray[i]<=90) {
			
			charArray[i]=(char) (charArray[i]+32);
		}
		
	}
	for(int i=0;i<charArray.length;i++) {
		System.out.print(charArray[i]);
	}
	}

}
