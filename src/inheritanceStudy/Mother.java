package inheritanceStudy;

public class Mother 
{
     String sname;
     static String name;
	
	public void sum(int a,int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void surname()
	
	{
		System.out.println(sname);
	}
	
	public static void name()
	{
		System.out.println(name);
		
	}
}
