package javaforinterviewquestions;

public class ExtractNumbersFromStringAdd {

	public static void main(String[] args) {
		
		String input="Sankaralingam123";
		
		//find the to total of string
		int length=input.length();
		
		//initiate the total variable
		int total=0;
		//iterate the input string using for loop
		//change the String to character and use the isDigit method
		//check the input as isNumeric from character
		for(int i=0;i<length;i++) {
			char character=input.charAt(i);
			if(Character.isDigit(character)) {
				int total1=Character.getNumericValue(character);
				total=total+total1;
			}
				
		}
		System.out.println(total);
		
		
		
		
	}

}
