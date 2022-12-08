package collection;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		java.util.LinkedHashSet lh=new java.util.LinkedHashSet<>();
		
		lh.add(123);
		lh.add(false);
		lh.add("ram");
		lh.add(false);
		lh.add("ram");
		lh.add(null);
		lh.add(null);
		System.out.println(lh);
		System.out.println(lh.clone());
		System.out.println(lh.contains(false));
		System.out.println(lh.remove(false));
		System.out.println(lh);
		
		for(Object a:lh)
		{
			System.out.println(a);
		}
		System.out.println("=========================================");
		
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
