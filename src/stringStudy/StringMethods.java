package stringStudy;

public class StringMethods {

	public static void main(String[] args)
	{
		//length method
		String name="velocity";
		String no="1234";
		
	int a=	name.length();
	System.out.println("lenght by creating referance variable");
	System.out.println(a);
	System.out.println("length by by directly using in printing statement");
	System.out.println(name.length());
	System.out.println(no.length());
	System.out.println("=====================================================================");
      
	//toUpperCase method
	
	System.out.println(name.toUpperCase());
	
	       String b= name.toUpperCase();
	       System.out.println(b);
	       System.out.println(no.toUpperCase());
	       System.out.println("=======================================================");
   //toLowerCase method
	    String c =  b.toLowerCase();
	    System.out.println(c);
	  System.out.println("=============================================================");  
	  
	//equals method
	  String x="pune";
	  String y="pune";
	  String p=new String("pune");
	  String q=new String("pune");
	  String z=new String("PUNe");
	  System.out.println(x==y);
	  System.out.println(x==p);  //== checks memory location
	  System.out.println(p==q);
	  System.out.println("====================================================");
	boolean res = x.equals(y);
	System.out.println(res);
	System.out.println(y.equals(p));
	System.out.println(p.equals(q));
	System.out.println(p.equals(z));
	System.out.println("==========================================================");
	//equalsIgnoreCase
	 boolean city=    p.equalsIgnoreCase(z);
	 System.out.println(city);
	 System.out.println(x.equalsIgnoreCase(z));
	System.out.println("=============================================================");
	
	//contains method
	
	String ca="velocity";
	String er="invalid data";
	boolean noe=ca.contains("city");
	System.out.println("it contains"+noe);
	System.out.println(er.contains("invalid"));
	System.out.println("=================================================================");
	//isEmpty method
	 
	String a1="pune";
	String a2="";
	String a3=" ";
	System.out.println(a1.isEmpty());
	System.out.println(a2.isEmpty());
	System.out.println(a3.isEmpty());
	System.out.println("================================================================");
	//isBlank method
	
	System.out.println(a1.isBlank());
	System.out.println(a2.isBlank());
	System.out.println(a3.isBlank());
	
	System.out.println("================================================================");
	//chatAt method
	  String b1="vishal23";
	char cha= b1.charAt(7);
	System.out.println(cha);
	System.out.println("=================================================================");
	//endsWith method
	String state="maharashtra";
	state.endsWith("ra");
	System.out.println(state.endsWith("tra"));
	//startsWith method
	System.out.println(state.startsWith("maha"));
	//starts with by using index
	System.out.println(state.startsWith("ara", 3));
	System.out.println("===================================================================");
	
	//substring method
	String whr="i am in pune";
	
	System.out.println(whr.substring(5));
	System.out.println(whr.substring(0, 6));
	
	System.out.println("===================================================================");
	
	//concat method use
	 String c1="good";
	 String c2="morning";
	 
	 System.out.println(c1.concat( c2));
	 System.out.println(c1.concat(" night"));
	 
	 //indexOf method
	 
	 String h="hello hello";
	 
	 System.out.println(h.indexOf("e"));
	 System.out.println(h.lastIndexOf("l"));
	 System.out.println(h.indexOf("h",4));
	 
	 //replace method use
	  
	 String how="un happpy";
	 String se="i am in pune";
	 
	 System.out.println(how.replace("un", ""));
	 System.out.println(how.replace("un", "very"));
	 System.out.println(se.replace("pune", "jalna"));
	 
	 
	 
	 
	
	
	
	
	
	
	
	       
	
	
	
	
	
	}

}
