package javaconcepts;

public class StringExample {

	public static void main(String[] args) {
		
		//Used the below site to learn
		//https://www.simplilearn.com/tutorials/java-tutorial/java-strings
		String  s1=new String("Simplelearn");
		System.out.println(s1);
		
		String s2="Welcome";
		
		String s3="practice ";
		
		String s4="practice ";
		
		//CharAt()
		
		System.out.println("charactor at in the string s2= "+s2.charAt(2));
		
		//String Concatenation cancat()
		
		System.out.println("Cancatenation of s1+s2= "+s1.concat(s2));
		
		//String trim()
		
		System.out.println("string of trim s4 and s5= " +s3.trim()+s4.trim());
		
		//Compare the string equals()
		
		System.out.println("string comparison of s1+s2 "+s1.equals(s2));
		
		System.out.println("string comparison of s3+s4 "+s3.equals(s4));
		
		//Comparing the string compareTo()
		
		System.out.println(s1.compareTo(s2));

		System.out.println(s2.compareTo(s3));

		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareTo(s4));
		
		
		//Character contains contains()
		
		String str="SimpleLearn the E-Platform";
		
		System.out.println(str.contains("E-"));
		
		boolean is=str.contains("SimpleLearn");
		
		System.out.println(is);
		
		
		//end with Character or word endWith()
		
		System.out.println(str.endsWith("the"));
		
		//format of the string 
		
		System.out.println(String.format(str));
		
		//String equalsIgnoreCase()
		
		System.out.println(str.equalsIgnoreCase(str));
		
		//String toLower()
		System.out.println(str.toLowerCase());
		
		//String toUpper()
		System.out.println(str.toUpperCase());
		
		//get byte value getBytes()
		String string = "SIMPLI LEARN";
		
		byte[] bytearray=string.getBytes();
		
		System.out.println(bytearray);
		
		for (byte b : bytearray) {
			System.out.println(b);
			
		}
		
		//string length()
		
		System.out.println(string.length());
		
		//indexof()
		System.out.println(string.indexOf("LEARN"));
		
		System.out.println(string.indexOf("LI", 4));
		
		
		//String intern()
		
		System.out.println(s1 == s2);

		System.out.println(s2 == s3);
		
		//String isEmpty()
		
		System.out.println(s1.isEmpty());

		System.out.println(s2.isEmpty());
		
		//String join()
		
		String joinString1 = String.join("-", "Welcome", "to", "Simplilearn");

		System.out.println(joinString1);
		
		//replace()
		String s11 = "Hello World, Welcome to Java";

		String replaceString = s11.replace('W', 'H');

		System.out.println(replaceString);
		
		//replace all()
		
		String replaceString1 = s1.replaceAll("l", "a");

		System.out.println(replaceString1);
		
		//split
		
		String ss = "Hello World Welcome to Simplilearn";

		String[] words = ss.split("\\s");
		
		for (String w : words) {

			System.out.println(w);

			}
	}

}
