package javaConcept;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		
		list.add("sankara");
		list.add("Lingam");
		list.add("Lingam");
		
		System.out.println(list);
		
		list.set(0, "Lingam");
		System.out.println(list);

	}

}
