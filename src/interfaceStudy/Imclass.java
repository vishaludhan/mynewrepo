package interfaceStudy;

public class Imclass implements IC2{

	public static void main(String[] args)
	{
	Imclass i=new Imclass();
	i.test1();
	i.test3();

	}

	@Override
	public void test1() {
		System.out.println(a);
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		System.out.println(a);
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

}
