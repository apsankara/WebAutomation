package sdetLearning;

public class StringExample {

	public static void main(String[] args) {
		
		String s="Welcome";
		String s1="To Java";
		System.out.println(s.charAt(2));//l
		System.out.println(s.contains("Wel"));//true
		System.out.println(s.concat(s1));//Welcome To Java
		System.out.println(s.contentEquals(s1));//false
		System.out.println(s.endsWith("e"));//true
		System.out.println(s.replace('e', 'a'));
		System.out.println(s.substring(0,3));//wel
		System.out.println(s.equals(s1));//false
		System.out.println(s.equals("Welcome"));//true
		System.out.println(s.contains("Wel"));//true
		System.out.println(s.contains("wel"));//false
		System.out.println(s.equalsIgnoreCase("welcome"));//true
		System.out.println(s.getBytes());
		System.out.println(s.compareTo("Welcome"));//true
		System.out.println(s.compareToIgnoreCase(s1));//false
		System.out.println(s.replace("Wel", "Going"));//Goingcome
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s1.trim());
		
	}

}
