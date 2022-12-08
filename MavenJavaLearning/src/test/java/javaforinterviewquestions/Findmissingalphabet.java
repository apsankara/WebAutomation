package javaforinterviewquestions;

import java.util.Arrays;
import java.util.HashSet;

public class Findmissingalphabet {

	public static void main(String[] args) {
		
		String given="a";
		
		//format the string
		
		given=given.toLowerCase();
		
		//remove the space and unwanted 
		
		given.toLowerCase();
		
		//change the character to string array
		
		String[] givenArray=given.split("");
		
		//create the another set to compare and create string array
		String alphaArray="abcdefghijklmnopqrstuvwxyz";
		String[] Array=alphaArray.split("");
		
		// create the hash set and add the as list of first set
		HashSet<String> set1 =new HashSet<String>(Arrays.asList(givenArray));
		
		// create the hash set and add the as list of second set to compare		
		HashSet<String> set2=new HashSet<String>(Arrays.asList(Array));
		
		set2.removeAll(set1);
		System.out.println(set2);
	}

}
