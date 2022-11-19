package sdetLearning;

public class ArrayStringSpecific {

	public static void main(String[] args) {
		
		String a[]= {"Java","Selenium","Eclipse"};
		String find="Javaa";
		boolean found=false;
		
		for(String val:a)
		{
			if(val==find)
			{	
				found = true;
				break;
			}
			
		}
		if(found)
		      System.out.println(find + " is found.");
		    else
		      System.out.println(find + " is not found.");
		
	}

}
