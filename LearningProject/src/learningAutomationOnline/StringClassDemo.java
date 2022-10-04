package learningAutomationOnline;

public class StringClassDemo {

	public static void main(String[] args) {
		String name="Sankaralingam";
		
		System.out.println("Srting of Charat " +name.charAt(0));//S
		
		System.out.println("String of contains "+name.contains("lingam"));//true
		
		System.out.println("String of contain " +name.contains("Welcome"));//false
		
		System.out.println("String  og equal method "+name.equals("Sankara") );//false
		System.out.println("String  og equal method "+name.equals("Sankaralingam") );//true
		
		System.out.println("String  og equal method "+name.equalsIgnoreCase("Sankara") );//false
		System.out.println("String  og equal method "+name.equalsIgnoreCase("Sankaralingam") );//true
		
		System.out.println("String of replace "+name.replace("gam", "kam"));
		System.out.println("String of replace "+name.replaceAll("gamdd", "kaam"));
		
		System.out.println("String of "+name.trim());
		System.out.println("String of "+name.concat("Aadhinath"));
		
		System.out.println("String of "+name.compareTo("Welcome"));
		System.out.println("String of "+name.compareTo("Sankaralingam"));
		
		System.out.println("String of lower "+name.toLowerCase());
		System.out.println("String of upper "+name.toUpperCase());
		
		System.out.println("String of lower "+name.isEmpty());
		System.out.println("String of lower "+name.isBlank());
		
		System.out.println("String of lower "+name.indexOf(2));
		System.out.println("String of lower "+name.lastIndexOf(2));
		System.out.println("String of lower "+name.stripIndent());
		
		System.out.println("String of lower "+name.hashCode());
		System.out.println("String of lower "+name.codePointAt(1));
		System.out.println("String of lower "+name.codePointBefore(1));
		System.out.println("String of lower "+name.codePointCount(5,8));
		System.out.println("String of lower "+name.formatted("Welcome"));
		System.out.println("String of lower "+name);
		
		
	}

}
