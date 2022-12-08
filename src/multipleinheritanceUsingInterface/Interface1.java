package multipleinheritanceUsingInterface;

public interface Interface1 
{
     void m1();
	
	default void test1()
	{
		System.out.println("i am default method from interface1");
	}
	
	
	
	
	 static void tset3()
	{
		System.out.println("i am static method from interface1");
	}
	
	
	
	
}
