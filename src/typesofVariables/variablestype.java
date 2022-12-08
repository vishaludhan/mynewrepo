package typesofVariables;

public class variablestype {
	
	
	// non-static  global variables                                    //static global variables
	int a;                                                               static String c="vishal";
	float d=34.65f;                                                      static char f='f';
	char e='m';                                                          static  double b=20.45;
	
	
	 
	

	public static void main(String[] args) 
	{
		
		variablestype t=new variablestype();
		t.my();
		System.out.println(t.a);
		System.out.println(b);
		System.out.println(t.d);
		System.out.println(t.e);
		System.out.println(c);System.out.println(f);
		System.out.println(b);

	}
public  void my()
{
	System.out.println(c);
}
	
}
