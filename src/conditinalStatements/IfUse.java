package conditinalStatements;

public class IfUse {

	public static void main(String[] args)
	{    int num=32;
	     int b=32;
		char gender='M';
		String name="vishal";
		float per=74;
		boolean pass=true;
		String sname="vishal";
         if (gender=='M')
         {
			System.out.println("gender is male");
	     }else {
			System.out.println("i am female");
		}
			
		if (name==sname) {
			System.out.println("my name is vishal");
		}else {
			System.out.println("my is differnt");
		}
        if (per>=75) {
			System.out.println("i am in distinction");
		}else {
			System.out.println("i  am just pass");
		}
        if (pass) {
			System.out.println("i am pass");
		}else {
			System.out.println("i am fail");
		}
        
        if (num>=b) {
			System.out.println("num is big");
		}else {
			System.out.println("b is big");
		}
        
        
        
        
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
