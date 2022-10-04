package learningAutomationOnline;

public class StringBuffered {

	public static void main(String[] args) {
		String name="Sankaralingam";
		
		
		System.out.println("String Immutable values can not be changed "+name);
		/*System.out.println("Value os String "+name.concat("Adhavan"));
		System.out.println("String Immutable values can not be changed "+name);
		StringBuffer buffer=new StringBuffer("Aadhinath");
		System.out.println("StringBuffer is mutable values can be changed "+buffer);
		System.out.println("StringBuffer  "+buffer.append("Sankaralingam"));
		System.out.println("StringBuffer is mutable values can be changed "+buffer);*/
		
		//StringBuffer method
		StringBuffer buffer=new StringBuffer("Aadhinath");
		//System.out.println("String Revers "+buffer.reverse());
		System.out.println("String Capacity "+buffer.capacity());
		System.out.println("String Delete "+buffer.delete(0,4));
	}

}
