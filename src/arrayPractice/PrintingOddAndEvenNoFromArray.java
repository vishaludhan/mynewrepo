package arrayPractice;

public class PrintingOddAndEvenNoFromArray {

	public static void main(String[] args) 
	{
		int num[]= {1,2,3,4,5,6,7,8};
		
		System.out.println("even number");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}
		System.out.println("odd number");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				System.out.println(num[i]);
			}
		}

	}

}
