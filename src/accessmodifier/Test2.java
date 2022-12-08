package accessmodifier;

public class Test2 {

	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.demo2();
		t.demo3();
		t.demo4();
		Test1.demo5();
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);

	}

}
