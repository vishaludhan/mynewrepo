package logicalProgram;

import java.util.Scanner;

public class MultipilicationWithoutMutiOperator {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
	
		
		int sum=0;
		for(int i=1;i<=b;i++)
			
		{
			sum=sum+a;
			
		}
		System.out.println("multiplication of no is :"+sum);

	}

}
