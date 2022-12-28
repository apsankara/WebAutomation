package sDETInterviewQuestion;

public class ReverseStringBuffet {

	public static void main(String[] args) {
		//Reverse the String using String Buffer.
				String name1="Sankaralingam";
				StringBuffer sb=new StringBuffer(name1);
				StringBuffer rev=sb.reverse();
				System.out.println(rev);
	}

}
