package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.openqa.selenium.remote.html5.AddApplicationCache;

public class VectorStudy {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add("vishal");
		v.add("udhan");
		v.add('M');
		v.add(false);
		v.add(null);
		v.add(123);
		v.add(45.76);
		v.add('A');
		v.add('B');
		v.add(true);
		v.add("civil");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.contains(null));
		System.out.println(v.get(7));
		System.out.println(v.size());
		System.out.println("=====================================================");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("========================================================");
		for(Object vi : v)
		    {
			    System.out.println(vi);
			}
		System.out.println("=========================================================");
		Iterator<Object> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("===========================================================");
		System.out.println("List Iterator");
		
		ListIterator<Object> vl = v.listIterator();
		while(vl.hasNext())
		{
			
			System.out.println(vl.next());
			
		}
		
		System.out.println("============================================================");
		System.out.println("Enumeration");
	
		Enumeration<Object> ve = v.elements();
		
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
