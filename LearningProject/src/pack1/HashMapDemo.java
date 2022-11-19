package pack1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap <Integer,String> hashmap=new HashMap<Integer, String>();
		
		//add values into the hashmap
		
		hashmap.put(101, "Sankar");
		hashmap.put(102,"Lingam");
		hashmap.put(103, "Adhavan");
		hashmap.put(104, "Adhinath");
		hashmap.put(105, "Ajitha");
		
		System.out.println(hashmap);
		hashmap.remove(101);
		System.out.println(hashmap);
		
		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}
}
