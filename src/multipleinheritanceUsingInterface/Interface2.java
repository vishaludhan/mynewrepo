package multipleinheritanceUsingInterface;

public interface Interface2
{

	default void test1()
	{
		System.out.println("i am default method from interface2");
	}
	
	
	
	
	static void test3()
	{
		System.out.println("i am static method from interface1");
	}
	
	
}
