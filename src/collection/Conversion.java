package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversion {

	public static void main(String[] args) {
	         HashSet hs=new HashSet<>();
	           hs.add("vishal");
	           hs.add(123);
	           hs.add(12);
	           hs.add("udhan");
	           hs.add("patil");
	           System.out.println(hs);
		 ArrayList as=new ArrayList<>(hs);
		 System.out.println(as);
       
	}

}
