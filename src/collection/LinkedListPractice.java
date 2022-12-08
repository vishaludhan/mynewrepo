package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) 
	{
		
		
		LinkedList ll=new LinkedList();
		
		ll.add("vishal");
		ll.add('B');
		ll.add(123);
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(3, false);
		
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));
		System.out.println(ll.contains('B'));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println(ll.indexOf(123));
		System.out.println(ll.remove(3));
		System.out.println(ll);
		System.out.println(ll.offerFirst("udhan"));
		System.out.println(ll);
		System.out.println(ll.offer('M'));
		System.out.println(ll);
		System.out.println(ll.offerLast(67.87));
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
		
		System.out.println("========iterate by using for loop=======");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
			
		}
		
		System.out.println("========iterate by using for each loop=======");
		
		for(Object v:ll)
		{
			System.out.println(v);
		}
		
		System.out.println("========iterate by using iterator=======");
		  Iterator it = ll.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  System.out.println("========iterate by using list iterator=======");
		   ListIterator lt = ll.listIterator();
		   while(lt.hasNext())
		   {
			   System.out.println(lt.next());
		   }
		
		System.out.println(ll);
		ll.push("vishal");
		System.out.println(ll);
		
		
		
		
		
		
		

	}

}
