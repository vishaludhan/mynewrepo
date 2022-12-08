package methodStudy;

public class CallingNonStaticMethodFromOtherClass {

	public static void main(String[] args) {
		SampleMethods sp=new SampleMethods();
		sp.start(); 
		CallingNonStaticMethodFromSameClass na=new CallingNonStaticMethodFromSameClass();
		na.myname();
		na.myeducation();
		SampleMethods.intro();
		SampleMethods.wish();
		sum(10, 23);

	}
    public static void sum(int a,int b)
    {
    	int c=a+b;
    	System.out.println(c);
    	
    }
}
