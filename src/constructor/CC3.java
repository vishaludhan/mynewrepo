package constructor;

public class CC3 {
          int a,b;
          
	public static void main(String[] args)
	{
		CC3 c=new CC3();
		

	}
	public CC3(int num1,int num2)
	{
		
		System.out.println("hum hai constructor");
		a=num1;
		b=num2;
		
		int c=a+b;
		System.out.println(c);
	}
	public CC3()
	{
		this(45, 100);
		System.out.println("default constryctor");
	}

}
