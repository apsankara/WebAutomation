package pack1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		list.add("100");
		list.add("Welcome");
		list.add("Sankara");
		list.add("101");
		
		System.out.println(list.size());
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(1, "Lingam");
		System.out.println(list.size());
		System.out.println(list);
		
		for (Object object : list) {
			System.out.println(object);
			
		}
	}

}
