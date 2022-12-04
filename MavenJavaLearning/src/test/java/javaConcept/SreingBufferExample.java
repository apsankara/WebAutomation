package javaConcept;

public class SreingBufferExample {

	public static void main(String[] args) {
		//String 
				String name="Sankar";		
				System.out.println("Concadenation of of two string "+name.concat("Lingam"));
				System.out.println(name);
				
				//StringBuffer	
				StringBuffer buff=new StringBuffer("Aadhavan ");
				System.out.println(buff.append(name));
				System.out.println(buff);
				System.out.println(buff.replace(5, 7, "Sankara"));
				
				System.out.println(buff.insert(5, "van"));
				
				System.out.println(buff.capacity());
				         
				System.out.println(buff.delete(15, 16));
		
	}

}
