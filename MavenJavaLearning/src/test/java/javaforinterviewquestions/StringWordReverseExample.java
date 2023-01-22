package javaforinterviewquestions;
import java.util.*;
public class StringWordReverseExample {


	public void reverseword()
	{
		String word="I Love Agni";

		String reverse="";

		String[] split=word.split(" ");

		System.out.println(split.length);

		for(int i=split.length-1;i>=0;i--) {
			reverse=reverse+split[i]+" ";
			//System.out.print(reverse);
		}
		System.out.println(reverse);
	}
	
	public void reversechar() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character String");
		
		String character=scan.nextLine();
		
		System.out.println(character);
		scan.close();
		String reverse="";
		
		char[] charArray=character.toCharArray();
		System.out.println(charArray.length);
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			reverse=reverse+charArray[i];
		}
		System.out.println(reverse);
	}
	
	public void reversestringBuffer()
	{
		String name="Sankaralingam";
		
		StringBuffer buffer=new StringBuffer(name);
		
		StringBuffer reverse=buffer.reverse();
		System.out.println(reverse);
	}
	
	public void reversStringCollection()
	{
		String name="Sankaralingam";
		
		char[] charArray=name.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		for (Character character : charArray) {
			list.add(character);
		}
		
		Collections.reverse(list);
		
		ListIterator<Character> itetaror=list.listIterator();
		
		while(itetaror.hasNext()) {
			Character obj=itetaror.next();
			System.out.print(obj);
		}	
	}	

public static void main(String[] args) 
{
	StringWordReverseExample str=new StringWordReverseExample();
	//str.reverseword();
	//str.reversechar();
	//str.reversestringBuffer();
	str.reversStringCollection();


}
}