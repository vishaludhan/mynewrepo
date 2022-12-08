package stringmethods;

public class AllMethods {

	public static void main(String[] args) 
	{
		String date="10/8/1996";
		
		String[] valu = date.split("/");
		
		
		for(String a:valu)
		{
			System.out.println(a);
		}
		System.out.println("===========================================");
		
		String s="vishaludhan";
		System.out.println(s.substring(0,6));
		System.out.println(s.substring(6));

	}

}
