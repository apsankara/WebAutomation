package javaforinterviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringCollectionsChar {

	public static void main(String[] args) {
			
		String name="Agni";
		
		char[] array=name.toCharArray();
		
		List<Character> list=new ArrayList<Character>();		
		for (Character character : array) {
			list.add(character);
			
		}
		
		Collections.reverse(list);
		
		ListIterator<Character> iterator=list.listIterator();
		
		while(iterator.hasNext()) {
			Character revers =iterator.next();
			System.out.println(revers);
		}
		
	}	

}
