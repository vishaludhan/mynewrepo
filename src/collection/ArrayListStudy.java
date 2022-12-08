package collection;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add("vishal");
		al.add(123);
		al.add('M');
		al.add(23.23);
		al.add(true);
		al.add(null);
		System.out.println(al);
		al.add(1, "udhan");
		
		
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println("=========================================================");
		
		
		ArrayList<String> st=new ArrayList<>();
		
		st.add("vishal");
		st.add("udhan");
		st.add("jalna");
		System.out.println(st);
		
		System.out.println("===========================================================");
		ArrayList<Float> it=new ArrayList<>();
		it.add(12.3f);
		it.add(13.3f);
		it.add(14.3f);
		System.out.println(it);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
