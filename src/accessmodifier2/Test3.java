package accessmodifier2;

import accessmodifier.Test1;

public class Test3  extends Test1  {

	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.demo4();
		System.out.println(t.d);
		Test3 ts=new Test3();
		ts.demo3();
		demo5();

	}

}
