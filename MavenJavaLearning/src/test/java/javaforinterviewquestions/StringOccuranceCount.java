package javaforinterviewquestions;

import java.util.HashMap;

public class StringOccuranceCount {

	public static void main(String[] args) {
			
		//step1 initialize the given String
		String string="java";
		//initialize the character to store as key
		char ch;//key
		//initialize the count to store the count of the character
		int count;//value
		//Create the HashMap object
		HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
		//iterating the string to get the all character
		for(int i=0;i<string.length();i++)
		{
		//getting the character based on the position
		ch=string.charAt(i);
		if(hashMap.containsKey(ch))
		{
		//checking the initial count
		count=hashMap.get(ch);
		//incrementing the count
		count++;
		//replacing the character and count
		hashMap.replace(ch,count);
		}
		else
		{
		hashMap.put(ch,1);
		}
		}
		
		for( Character key:hashMap.keySet())
		{
		System.out.println(key+"="+hashMap.get(key));
		}
		}

}
