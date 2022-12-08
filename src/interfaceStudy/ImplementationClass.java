package interfaceStudy;

import thiseAndSuperUse.SuperUse;

public class ImplementationClass implements IC {
	

	public static void main(String[] args) 
	{
		ImplementationClass i=new ImplementationClass();
         i.test();
         i.test1();
         i.wish();
         int c=a+10;
         System.out.println(c);
		
	}
	
	public void wish()
	{
		System.out.println("happy birthday");
		System.out.println(a);
	}

	@Override
	public void test() {
		System.out.println("thise is test method from interface");
		System.out.println(a);
		
	}

	@Override
	public void test1()
	{
		System.out.println("thise is test1 method from interface");
		
	}

}
