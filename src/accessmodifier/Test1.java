package accessmodifier;

public class Test1 {

	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	
	
	public static void main(String[] args)
	{
		
		Test1 t=new Test1();
		t.demo1();
		t.demo2();
		t.demo3();
		t.demo4();
		demo5();
	     System.out.println("value of a  "+t.a);
	     System.out.println("value of b  "+t.b);
	     System.out.println("value of c  "+t.c);
	     System.out.println("value of d  "+t.d);


	}

	private void demo1()
	{
		System.out.println("thise is private method");
	}
	
	void demo2()
	{
		System.out.println("thise is default method");
	}
	
	protected void demo3()
	{
		System.out.println("thise is protected method");
	}
	
	public void demo4()
	{
		System.out.println("thise is public method");
	}
	
	protected static void demo5()
	{
		System.out.println("thise is static protected method");
	}
	
	
	
	
	
	
	
	
	
	
	
}
