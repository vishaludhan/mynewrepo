package arrayPractice;

public class CheckingEqualityOfArray 
{
public static void main(String[] args) 
{
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,3,4,5,6};
	
	
	boolean status=true;
	
	if(a1.length==a2.length)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==a2[i])
			{
				status=true;
			}
			else
			{
				status=false;
				break;
			}
		}
		
		
	}
	
	
	else 
	{
		status=false;
	}
	if(status==true)
	{
		System.out.println("both arrays are equals");
	}
	else
	{
		System.out.println("arrays are not equals");
	}
}

	
	
	
}
