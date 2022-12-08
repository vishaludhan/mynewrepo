package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
		TreeSet<Object> ts=new TreeSet<>();
		
		
		ts.add(4);
		ts.add(6);
		ts.add(9);
		ts.add(8);
		ts.add(2);
		ts.add(1);
	
		System.out.println(ts);
		System.out.println(ts.ceiling(4));
		System.out.println(ts.ceiling(7));
		System.out.println(ts.ceiling(10));
		System.out.println(ts.clone());
		System.out.println(ts.contains(4));
		System.out.println(ts.first());
		System.out.println(ts.floor(4));
		System.out.println(ts.floor(7));
		System.out.println(ts.higher(4));
		System.out.println(ts.higher(9));
		System.out.println(ts.isEmpty());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.remove(2));
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		
		

	}

}
