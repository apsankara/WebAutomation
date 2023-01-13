package sDETInterviewQuestion;

public class Sample {

	public static void main(String[] args) {
		
		//reverse the string
		
		String name="Sankar";
		
		System.out.println("Before the String Reverse " +name);
		
		//Reverse the String using the StringBuffer
		/*StringBuffer rev;		
		StringBuffer buff=new StringBuffer(name);
		rev=buff.reverse();
		System.out.println("After the String Reverse " +rev);
		*/
		
		/*StringBuilder build=new StringBuilder();
		build.append(name);		
		StringBuilder rev=build.reverse();
		System.out.println("After the String Reverse " +rev);*/
		
		//Reverse theString using the for loop with char array
		
		String rev = "";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			rev=rev+charArray[i];
		}
		System.out.println("After the String Reverse " +rev);
	}

}
