package logicalProgram;

public class CalculateFoctorialNo {

	public static void main(String[] args) 
	{
		int num=0;
		
		int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i;    //1*5=5
		}                     //5*4=20
                              //20*3=60
		System.out.println("factorial of num is:"+fact);                      //60*2=120
		                                           //120*1=120
	}

}
