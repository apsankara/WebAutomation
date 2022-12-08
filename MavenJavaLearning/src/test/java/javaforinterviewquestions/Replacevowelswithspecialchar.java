package javaforinterviewquestions;

public class Replacevowelswithspecialchar {

	public static void main(String[] args) {
		
		
		String givenText="I Miss Mahendra Singh Dhoni";
		
		char[] charArray=givenText.toCharArray();
		
		for(int i=0;i<givenText.length();i++)
		{
			if(givenText.charAt(i)=='a'||givenText.charAt(i)=='e'||givenText.charAt(i)=='i'||
					givenText.charAt(i)=='o'||givenText.charAt(i)=='u'||givenText.charAt(i)=='A'||
					givenText.charAt(i)=='E'||givenText.charAt(i)=='I'||givenText.charAt(i)=='O'||
					givenText.charAt(i)=='U')
			
				charArray[i]='*';			
			
		}
		
		for(int i=0;i<givenText.length();i++) {
			System.out.print(charArray[i]);
		}
		
		
		//Regular expression
		String replace=givenText.replaceAll("[AEIOUaeiou]", "_");
		System.out.println(replace);
	}

}
