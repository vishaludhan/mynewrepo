package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet<>();
		hs.add("vishal");
		hs.add(true);
		hs.add(123);
		hs.add('M');
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.contains(true));
		System.out.println(hs.hashCode());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(123));
		System.out.println(hs);
		
		HashSet<String> ht=new HashSet<>();
		
		ht.add("patil");
		ht.add("udhan");
		System.out.println(ht);
		
		for(Object b:hs)
		{
			System.out.println(b);
		}
		System.out.println("===============by using iterator==============");
		
	        Iterator it = hs.iterator();
	        while(it.hasNext())
	        {
	        	System.out.println(it.next());
	        }
		
	        System.out.println("========================================");
	        
	       for(String d:ht)   
	        {
	        	System.out.println(d);
	        }
	        
	      System.out.println("===========================================");  
	       Iterator<String> tt = ht.iterator();
	        
	        while(tt.hasNext())
	        {
	        	System.out.println(tt.next());
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
