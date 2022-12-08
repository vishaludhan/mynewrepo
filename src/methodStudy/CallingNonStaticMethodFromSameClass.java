package methodStudy;

public class CallingNonStaticMethodFromSameClass {

	public static void main(String[] args)
	{
		CallingNonStaticMethodFromSameClass na=new CallingNonStaticMethodFromSameClass();
                na.myname();
                na.myeducation();
	}

	public void myname()
	{
		System.out.println("my name is vishal");
	}
	
	public void myeducation()
	{
		System.out.println(" i am BE civil");
		
	}
	
	
}
