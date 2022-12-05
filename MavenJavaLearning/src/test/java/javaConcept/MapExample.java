package javaConcept;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	
	public static void main(String[] args) {
		
		//create the map
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		// Adding Elements using Map.
		map.put(1, "Sankar");
		map.put(2, "Lingam");
		map.put(3, "Welcome");
		
		// Elements can traverse in any order
		
		for(Map.Entry<Integer, String> set:map.entrySet()) {
				System.out.println(set.getKey()+" "+set.getValue()); 
				
		}
		
		
	}
}
