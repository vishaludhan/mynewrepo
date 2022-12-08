package thiseAndSuperUse;

public class ThiseUse {

	int a=12;
	
	
	
	
	
	public static void main(String[] args) 
	{
		ThiseUse tu=new ThiseUse();
		tu.sum();

	}

	
	public  void sum()
	{
		int a=30;
		int s=a+10;
		System.out.println(s);
		
		int d=this.a+10;
		System.out.println(d);
	}
	
	
}
