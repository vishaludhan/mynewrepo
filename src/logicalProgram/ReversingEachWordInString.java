package logicalProgram;

public class ReversingEachWordInString {

	public static void main(String[] args) {
		String name="vishal udhan purushottam";
		
		String[] word = name.split(" ");
		System.out.println(word[0]);
		System.out.println(word[1]);
		String Fullrev="";
		
		for(String w:word)
		{
			String  reversestr="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reversestr=reversestr+w.charAt(i);
			
			}
			Fullrev=Fullrev+reversestr+" ";
		}
		System.out.println(Fullrev);
	}
	
}
