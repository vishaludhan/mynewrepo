package logicalProgram;

public class FindingNoIsPrimeOrNot {

	public static void main(String[] args) 
	{
		int num=14;
		
		int count=0;
		
		if(num>1)
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is  prime");
		}
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
