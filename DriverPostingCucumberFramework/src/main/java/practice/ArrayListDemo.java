package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String arr[]= {"Welcome","qwe","Come"};
		for(String Value:arr) {
		System.out.println("Array value " +Value);
		}
		
		ArrayList all=new ArrayList(Arrays.asList(arr));
		System.out.println("Arraylist value is" +all);
		
		
		ArrayList al=new ArrayList();
		
		//add into list
		al.add("A");
		al.add("X");
		al.add('W');
		al.add("B");
		System.out.println(al.size());
		System.out.println("Arraylist value is" +al);
		//Collections.sort(al,Collections.reverseOrder());
		al.remove(1);
		System.out.println("Arraylist value is" +al);
		
		System.out.println(al.contains("A"));
		System.out.println("Arraylist value is" +al);
		al.clear();
		System.out.println("Arraylist value is" +al);
		al.removeAll(al);
		System.out.println("Arraylist value is" +al);
		
		
		
		
		
	}

}
