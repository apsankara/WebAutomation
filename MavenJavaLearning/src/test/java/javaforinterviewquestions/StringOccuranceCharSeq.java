package javaforinterviewquestions;

public class StringOccuranceCharSeq {

	public static void main(String[] args) {

		String name="Sankaralingam";

		name=name.toLowerCase();
		System.out.println(name);
		
		char toFind='a';
		
		int occurance=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==toFind)
			{
				occurance=occurance+1;
			}
		}
		System.out.println(occurance);

	}

}
