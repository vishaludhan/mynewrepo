package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		
		ll.add("vishal");
		ll.add(123);
		ll.add(null);
		ll.add('M');
		ll.add(true);
		ll.add(123.43);
		ll.add("udhan");
		ll.add('A');
		ll.add(false);
		ll.add("vishal");
		System.out.println(ll);
		ll.add(2, "ram");
		System.out.println(ll);
		ll.addFirst(456);
		System.out.println(ll);
		ll.addLast(456);
		System.out.println(ll);
		System.out.println(ll.contains(true));
		System.out.println(ll.contains("udhan"));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println(ll.equals('M'));
		System.out.println(ll.get(4));
		System.out.println(ll.get(6));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf('M'));
		System.out.println(ll.isEmpty());
		ll.offer("cuba");
		
		System.out.println(ll);
		System.out.println(ll.size());
		ll.offerFirst('A');
		System.out.println(ll);
		System.out.println(ll.offerLast(87));
		System.out.println(ll);
		System.out.println(ll.add("parvati"));
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll);
		
	System.out.println("===========by for loop=========");	
		for(int i=0;i<=ll.size()-1;i++)
		{
			
			System.out.println(ll.get(i));
			
		}
		
    System.out.println("===========by for each loop=========");	
    
    
    for(Object a:ll)
    {
    	
    	System.out.println(a);
    }
		
    System.out.println("===========by iterator=========");	
    
                 Iterator it = ll.iterator();
                 
                 while(it.hasNext())
                 {
                	 
                	 System.out.println(it.next());
                	 
                	 
                 }
    
   System.out.println("===========by listIterator=========");
   
                          ListIterator li = ll.listIterator(); 
    
    while(li.hasNext())
    {
    	
    	System.out.println(li.next());
    }
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
