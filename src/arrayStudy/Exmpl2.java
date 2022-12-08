package arrayStudy;

public class Exmpl2 {

	public static void main(String[] args)
	{
		
		char grade[]= {'A','B','C','D'};
		
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		grade[0]='a';    //we can update value
		
		System.out.println("==============================================================");
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
			
		}
		System.out.println("===============================================================");
		
		for(int i=grade.length-1;i>=1;i--)
		{
			
			System.out.println(grade[i]);
		}
		
		
		
		

	}

}
