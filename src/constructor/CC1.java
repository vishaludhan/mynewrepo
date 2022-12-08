package constructor;

public class CC1 extends CC3 {
     
     int a,b;
     public CC1()
		{   
			a=40;
			b=50;
			
			System.out.println("thise is constructor");
		}
		
		
	public static void main(String[] args) 
    {
		
		CC1 ad=new CC1();
		//ad.add();
		//ad.sub();
		PrivateConstructor p=new PrivateConstructor(89);
		
		

	}
            public void add()
            {
            	int sum=a+b;
            	System.out.println(sum);
            }
            public void sub()
            { 
            	int sub=a-b;
            	System.out.println(sub);
            }
}











