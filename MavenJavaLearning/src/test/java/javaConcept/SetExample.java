package javaConcept;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> Set = new HashSet<String>();
         
        // Adding Elements 
        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Set.add("five");
         
        // Set follows unordered way.
        System.out.println(Set);
    }
}

