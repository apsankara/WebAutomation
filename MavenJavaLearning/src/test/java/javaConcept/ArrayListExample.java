package javaConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<Object>();
		
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add("Welcome");
		list.add(12);
		
		System.out.println(list);
		
		list.remove(11);
		System.out.println(list);
		
		list.set(11, 15);
		System.out.println(list);
		
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		
		//Iterator itr=list.iterator();
		ListIterator<Object> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
