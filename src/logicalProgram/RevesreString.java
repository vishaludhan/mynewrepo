package logicalProgram;

import java.util.Scanner;

public class RevesreString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String name = sc.nextLine();
		System.out.println("given string  "+name);
		
		String reverseString="";
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			
		char t = name.charAt(i);
		
		reverseString=reverseString+t;
			
		}
		System.out.println("reverse string is  "+reverseString);
		if(name.equals(reverseString))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindromev");
		}
		
		
		
	}

}
