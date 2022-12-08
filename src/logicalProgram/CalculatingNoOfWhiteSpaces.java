package logicalProgram;

public class CalculatingNoOfWhiteSpaces {

	public static void main(String[] args) {
		String word=" hum hai rahi pya rke   ";
		//approach-1
		char space=' ';
		int spaceCount=0;
		
		for(int i=i=0;i<word.length();i++)
		{
			if(word.charAt(i)==space)
			{
				spaceCount++;
			}
		}
		
		System.out.println("Total no of spaces in a string  "+spaceCount);
		
	//approach-2	
		
		int oriString=word.length();
		   int afterremov = word.replace(" ", "").length();
		   
		   int noofspace=oriString-afterremov;
		   System.out.println(noofspace);
		

	}

}
