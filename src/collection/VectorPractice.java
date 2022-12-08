package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
	
		
		Vector<Character> v=new Vector<>();
		v.add('A');
		v.add('B');
		v.add('C');
		v.add('D');
		v.add('E');
		v.add('F');
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println("=====================================================");
		
		Enumeration<Character> ve = v.elements();
		
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		 
		                ListIterator<Character> vl = v.listIterator();
		                System.out.println(vl.hasPrevious());
		                System.out.println(vl.next());
		                System.out.println(vl.hasPrevious());

	}

}
