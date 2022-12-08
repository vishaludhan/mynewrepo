package arrayStudy;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args)
	{
		
		char grade[]= {'A','B','F','D','E'};
		
		Arrays.sort(grade);
		
		for(int i=0; i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
			
			
		}
		System.out.println("===================================================");
		
		for(int i=grade.length-1;i>=0;i--)
		{
			
			System.out.println(grade[i]);
			
		}
		

	}

}
