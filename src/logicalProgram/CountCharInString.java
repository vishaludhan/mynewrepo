package logicalProgram;

public class CountCharInString {

	public static void main(String[] args) 
	{
		
		String id="udhan32@gmail.com";
		
		int countOfChar = id.replaceAll("[^a-zA-z]", "").length();
		System.out.println("total count of char in string  "+countOfChar);
		
		
		int countOfNum = id.replaceAll("[^0-9]", "").length();
		System.out.println("total count of num :"+countOfNum);
		
		int countOfSpecialChar =id.replaceAll("[0-9a-z]", "").length();
		System.out.println("count of special char:"+countOfSpecialChar);

	}

}
