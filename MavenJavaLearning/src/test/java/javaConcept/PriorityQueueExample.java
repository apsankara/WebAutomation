package javaConcept;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element()); //return exception(noSuchElement) if empty
		System.out.println("head:"+queue.peek());  //return null if empty
		System.out.println("iterating the queue elements:"); 
		
		Iterator<String> itr=queue.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
	}

}
