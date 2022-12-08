package constructor;

public class PrivateConstructor {
	public static void main(String[] args) {
		
		PrivateConstructor p=new PrivateConstructor();
		
	}
	
	
	
	   private   PrivateConstructor ()
	   {
		   System.out.println("i am private constructor");
	   }
        
	   
	   
	   public PrivateConstructor(int a)
	   {
		   a=40;
		   System.out.println("ia not private"+a);
	   }
}
