package multipleinheritanceUsingInterface;

public class ImpleClass implements Interface1,Interface2
{
	public static void main(String[] args) 
	{
		ImpleClass i=new ImpleClass();
		i.test1();
		i.m1();
		Interface1.tset3();
		Interface2.test3();
	}
	
	
	

	@Override
	public void m1() {
	System.out.println("i am m method");
		
	}

	@Override
	public void test1() {

		Interface1.super.test1();
		Interface2.super.test1();
	}

}
