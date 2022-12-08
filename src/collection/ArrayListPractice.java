package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Character> grade=new ArrayList<>();
		grade.add('A');
		grade.add('B');
		grade.add('C');
		grade.add('D');
		grade.add('1');
		System.out.println(grade);
		
		System.out.println("====================================================");
		
		for(Character a:grade)
		{
			
			System.out.println(a);
		
		}
       System.out.println("=======================================================");
       
     Iterator<Character> it = grade.iterator();
     
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       System.out.println("======================================================");
       
     ListIterator<Character> lit = grade.listIterator();
     
     System.out.println(lit.hasNext());
     while(lit.hasNext())
     {
    	 System.out.println(lit.next());
     }
		
	
     
     
     
     
     
     
     
     
     
     
     
     
     
     
       
       
	}

}
