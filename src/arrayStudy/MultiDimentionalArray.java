package arrayStudy;

import java.util.Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args)
	{
		
		
		int num[][]=new int[2][2];
		
		
		num[0][0]=10;
		num[0][1]=11;
		num[1][0]=12;
		num[1][1]=13;
		System.out.println(num[0][1]);
		System.out.println(num.length);
		
		for(int i=0;i <=num.length-1;i++)
		{
			for(int j=0;j<=num.length-1;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("=================================================");
		
		
		char grade[][]=new char[3][2];
		
		grade[0][0]='A';
		grade[0][1]='B';
		grade[1][0]='C';
		grade[1][1]='D';
		grade[2][0]='E';
		grade[2][1]='F';
		
		
		for(int i=0;i<=grade.length-1;i++)
		{
			
			for(int j=0;j<=1;j++)
			{
				
				System.out.print(grade[i][j]+" ");
				
			}
			System.out.println();
			
			
			
		}
		
	System.out.println("=================================================================");	
		
		String name[][]=new String[2][4];
		 
		name[0][0]="vishal";
		name[0][1]="ram";
		name[0][2]="vivek";
		name[0][3]="prashant";
		name[1][0]="sagar";
		name[1][1]="manas";
		name[1][2]="vilas";
		name[1][3]="sai";
	
		for(int i=0;i<=name.length-1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				
				System.out.print(name[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		

	}

}
