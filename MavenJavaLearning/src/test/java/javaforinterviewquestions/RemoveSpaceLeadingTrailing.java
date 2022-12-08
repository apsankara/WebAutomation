package javaforinterviewquestions;

public class RemoveSpaceLeadingTrailing {

	public static void main(String[] args) {
		
		String name=" Welcome Agni ";
		
		System.out.println(name.trim());
		
		System.out.println(name.strip());
		//leading and trailing
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));
		//leading 
		System.out.println(name.replaceAll("^[ \t]", ""));
		// trailing
		System.out.println(name.replaceAll("[ \t]+$", ""));
	}

}
