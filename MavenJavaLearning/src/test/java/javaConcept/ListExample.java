package javaConcept;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String args[])
    {
 
        // Creating a List
        List<String> list = new ArrayList<String>();
 
        // Adding elements in the List
        list.add("mango");
        list.add("orange");
        list.add("Grapes");
 
        // Iterating the List
        // element using for-each loop
        for (String fruit : list)
            System.out.println(fruit);
    }
}
