package constructor;

import java.security.PublicKey;

public class CC2 {
int a;
int b;
String name;
String surname;
float c;
public CC2()
{
	a=12;
	b=12;
	System.out.println("constructor");
}
public CC2(int num1,int num2)
{
	a=num1;
	b=num2;
System.out.println(a);
System.out.println(b);

}

	public CC2(String na,String sur)
	{
		name=na;
		surname=sur;
		
		
	}
	public CC2(float n)
	{
		c=n;
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		
		CC2 c=new CC2();
		c.add();
		CC2 f1=new CC2(20,12 );
		f1.add();
		CC2 in=new CC2("vishal", "udhan");
		in.info();
		CC2 f=new CC2(50f);

	}
	
	public void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void info()
	{
		System.out.println("my name is  "+name);
		System.out.println("my surname is  "+surname);
		
	}
	
	
	
}













