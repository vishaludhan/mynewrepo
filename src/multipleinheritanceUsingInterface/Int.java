package multipleinheritanceUsingInterface;

public class Int implements Interface1,Interface2
{

	public static void main(String[] args)
	{
	Int i=new Int();
	i.test1();
	

	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		Interface1.super.test1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}



	

}
