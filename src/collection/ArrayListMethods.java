package collection;

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args)
	{
		ArrayList lis=new ArrayList();
		
		lis.add("vishal");
		lis.add("udhan");
		lis.add('M');
		lis.add(123);
		lis.add(20.5f);
		lis.add(null);
		lis.add(false);
		System.out.println(lis);
		lis.add(7, "civil");
		System.out.println(lis);
		
		//lis.clear();                                   //clear method
		System.out.println(lis);
		boolean isEmpty = lis.isEmpty();                 //isEmpty method
		System.out.println(isEmpty);
		boolean isContains = lis.contains(null);         //isContain method
		System.out.println(isContains);
		System.out.println(lis.contains(null));
		
		
		Object value = lis.get(2);
		System.out.println(value);                        //getMethod
		
		
		int aaraySize = lis.size();
		System.out.println(aaraySize);
		
		System.out.println(lis.remove(5));                //removeMethod by index
		System.out.println(lis);
		System.out.println(lis.size());
		System.out.println(lis.remove(false));            //removeMethod by object
		System.out.println(lis);
		System.out.println(lis.size());
		
		
		
		System.out.println(lis.indexOf("civil"));         //indexof method
		System.out.println(lis.indexOf('M'));
		
		System.out.println("=====================================================================");
		
		for(Object a:lis)
		{
			
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
