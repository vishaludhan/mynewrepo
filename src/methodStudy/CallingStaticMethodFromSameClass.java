package methodStudy;

public class CallingStaticMethodFromSameClass {

	public static void main(String[] args)
	{
		add();
		sub();
       
	}
	
	public static void add()
	{
		
		int a=12;
		int b=8;
		int c=a+b;
		System.out.println("addition  "+c);
		
		
	}
    public static void sub()
    { 
    	int a=50;
    	int b=25;
    	int c=a-b;
    	System.out.println("subtraction  "+c);
    	
    	
    	
    }
    
}
