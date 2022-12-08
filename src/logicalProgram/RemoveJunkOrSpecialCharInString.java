package logicalProgram;

public class RemoveJunkOrSpecialCharInString {

	public static void main(String[] args) 
	{
		String s="12#@!45^%     vishal udhan";
		
		 String ne = s.replaceAll("[^a-z0-9@]", "");
		  System.out.println(ne);
		  
		 System.out.println( s.replace("", ""));
		 

	}

}
