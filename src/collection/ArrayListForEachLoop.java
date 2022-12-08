package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForEachLoop {

	public static void main(String[] args) {
		 
		
		ArrayList<Integer> it=new ArrayList<>();
		
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		it.add(50);
		it.add(60);
		it.add(70);
		System.out.println(it);
		System.out.println("=======================================================");
		
		for(int i=0;i<=it.size()-1;i++)
		{
			
			System.out.println(it.get(i));
			
		}
		
		
		System.out.println("=======================================================");
		
		for(Integer no:it)
		{
			System.out.println(no);                                   //for each loop
			
		}
		
		
		System.out.println("=========================================================");
		
		
		Iterator<Integer> intetr = it.iterator();
		
		/*System.out.println(intetr.hasNext());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.next());
		System.out.println(intetr.hasNext());*/
		
		while(intetr.hasNext())
		{
			System.out.println(intetr.next());
			System.out.println("===");
		}
		
		
		
		
		
		
		

	}

}
