package javaforinterviewquestions;

public class StringOccurancewithoutIteration {

	public static void main(String[] args) {
		String input="Agniprasath";
		
		char toFind='a';
		
		input=input.toUpperCase();
		
		System.out.println(input);
		
		String chartoFind=Character.toString(toFind).toUpperCase();
		
		System.out.println(chartoFind);
		
		int beforelength=input.length();
		
		System.out.println(beforelength);
		
		String afterreplace=input.replace(chartoFind, "");
		
		int afterlength=afterreplace.length();
		
		System.out.println(afterlength);
		
		System.out.println(beforelength-afterlength);
		
		
	}

}
