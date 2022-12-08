package polymorphismStudy;

public class ICICIclass extends RBIClass
{

	public static void main(String[] args) {
		RBIClass s1;
		s1=new ICICIclass();
		
		s1.m1();
		s1=new SBIclass();
		s1.m1();
		

	}

	public void m1()
	{
		System.out.println("thise is ICICI method");
	}
	
}
