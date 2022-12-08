package arrayStudy;

import java.util.Arrays;

public class MultDimArrayExm2 {

	public static void main(String[] args)
	{
		char grade[][]= {{'A','D','C'},{'B','F','E'}};
		
		
		for (int i = 0; i<=grade.length-1; i++) 
		{
			for(int j=0;j<=2;j++)
			{
				
				System.out.print(grade[i][j]+" ");
				
			}
			System.out.println();
		}

	String name[][]= {{"vishl","pramod","sachin"},{"samiksha","pranali","komal"},{"vilas","vivek","sagar"}};
	
	for(int i=0; i<=name.length-1;i++)
	{
		for(int j=0;j<=name.length-1;j++)
		{
			System.out.print(name[i][j]+" ");
		}
		System.out.println();
	}
		
		
		
	}

}
